package ${package.Controller};


import org.springframework.web.bind.annotation.RequestMapping;
import ${package.Entity}.${entity};
import ${package.Service}.${table.serviceName};
import com.karl.carshop.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

<#if restControllerStyle>
import org.springframework.web.bind.annotation.RestController;
<#else>
import org.springframework.stereotype.Controller;
</#if>
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>

/**
* <p>
    * ${table.comment!} 前端控制器
    * </p>
*
* @author ${author}
* @since ${date}
*/
@Api(tags = "${table.comment}")
<#if restControllerStyle>
@RestController
<#else>
@Controller
</#if>
@RequestMapping("<#if package.ModuleName?? && package.ModuleName != "">/${package.ModuleName}</#if>/<#if controllerMappingHyphenStyle??>${controllerMappingHyphen}<#else>${table.entityPath}</#if>")
<#if kotlin>
    class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
<#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
<#else>
public class ${table.controllerName} {
</#if>

    @Autowired
    private ${table.serviceName} ${table.entityPath}Service;

    @ApiOperation(value = "${table.comment}新增")
    @PostMapping
    public JsonResult<Void> save(@RequestBody ${entity} ${table.entityPath}) {
        ${table.entityPath}Service.saveOrUpdate(${table.entityPath});
        return new JsonResult<Void>(200);
    }

    @ApiOperation(value = "${table.comment}删除")
    @DeleteMapping("/{id}")
    public JsonResult<Void> delete(@PathVariable Integer id) {
        ${table.entityPath}Service.removeById(id);
        return new JsonResult<Void>(200);
    }

    @ApiOperation(value = "${table.comment}列表")
    @GetMapping
    public JsonResult<List<${entity}>> findAll() {
        return new JsonResult<List<${entity}>>(200, ${table.entityPath}Service.list());
    }


    @ApiOperation(value = "${table.comment}详情")
    @GetMapping("/{id}")
    public JsonResult<${entity}> findOne(@PathVariable Integer id) {
        return new JsonResult<${entity}>(200, ${table.entityPath}Service.getById(id));
    }

}
</#if>

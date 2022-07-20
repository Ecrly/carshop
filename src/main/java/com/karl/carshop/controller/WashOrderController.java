package com.karl.carshop.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import com.karl.carshop.entity.WashOrder;
import com.karl.carshop.service.WashOrderService;
import com.karl.carshop.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

    import org.springframework.stereotype.Controller;

/**
* <p>
    * 洗车订单 前端控制器
    * </p>
*
* @author cl
* @since 2022-07-20
*/
@Api(tags = "洗车订单")
@Controller
@RequestMapping("/carshop/wash-order")
public class WashOrderController {

    @Autowired
    private WashOrderService washOrderService;

    @ApiOperation(value = "洗车订单新增")
    @PostMapping
    public JsonResult<Void> save(@RequestBody WashOrder washOrder) {
        washOrderService.saveOrUpdate(washOrder);
        return new JsonResult<Void>(200);
    }

    @ApiOperation(value = "洗车订单删除")
    @DeleteMapping("/{id}")
    public JsonResult<Void> delete(@PathVariable Integer id) {
        washOrderService.removeById(id);
        return new JsonResult<Void>(200);
    }

    @ApiOperation(value = "洗车订单列表")
    @GetMapping
    public JsonResult<List<WashOrder>> findAll() {
        return new JsonResult<List<WashOrder>>(200, washOrderService.list());
    }


    @ApiOperation(value = "洗车订单详情")
    @GetMapping("/{id}")
    public JsonResult<WashOrder> findOne(@PathVariable Integer id) {
        return new JsonResult<WashOrder>(200, washOrderService.getById(id));
    }

}

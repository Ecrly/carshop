package com.karl.carshop.controller;


import com.karl.carshop.entity.BaseEntity;
import com.karl.carshop.entity.User;
import com.karl.carshop.service.IUserService;
import com.karl.carshop.service.ex.InsertException;
import com.karl.carshop.service.ex.UsernameDuplicatedException;
import com.karl.carshop.util.JsonResult;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("users")
@Api(value = "用户接口", tags = {"用户接口"})
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;


    @PostMapping("reg")
    @ApiOperation("用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name="username",value="手机号123",required=true,paramType="form", dataType = "String"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType="form", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public JsonResult<Void> reg(User user){
        userService.reg(user);
        return new JsonResult<>(OK);
    }


    @ApiOperation("用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name="username",value="手机号",required=true,dataType = "String"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType="form", dataType = "String")
    })
    @PostMapping("login")
    public JsonResult<User> login(String username, String password, @ApiIgnore HttpSession session){
        User data = userService.login(username,password);
        //向session对象中完成数据的绑定
        session.setAttribute("uid",data.getUid());
        session.setAttribute("username",data.getUserName());
        //获取session中的绑定的数据
        System.out.println(getuidFromSession(session));
        System.out.println(session.getAttribute("username"));
        System.out.println(getUsernameFromSession(session));

        return new JsonResult<User>(OK,data);
    }

    /*
    @RequestMapping("reg")
    public JsonResult<Void> reg(User user){
        //创建响应结果对象
        JsonResult<Void> result = new JsonResult<>();
        try {
            userService.reg(user);
            result.setState(200);
            result.setMessage("用户注册成功");
        }catch (UsernameDuplicatedException e){
            result.setState(4000);
            result.setMessage("用户名被占用");
        }catch (InsertException e){
            result.setState(5000);
            result.setMessage("注册时产生未知的异常");
        }
        return result;
    }*/
}

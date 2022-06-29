package com.karl.carshop.controller;

import com.karl.carshop.service.ex.*;
import com.karl.carshop.util.JsonResult;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;
import java.nio.channels.SeekableByteChannel;

/** 控制层类的基类 */
public class BaseController {
    //操作成功状态码
    public static final int OK = 200;

    //请求处理方法，这个方法的返回值就是需要传递给前端的数据
    //自动将异常对象传递给此方法的参数列表上
    @ExceptionHandler(ServiceException.class)//用于统一处理抛出的异常
    public JsonResult<Void> handleException(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);
        if (e instanceof UsernameDuplicatedException) {
            result.setState(4000);
            result.setMessage("用户名已经被占用");
        } else if (e instanceof UserNotLogin) {
            result.setState(4001);
            result.setMessage("用户未未登录的异常");
        } else if (e instanceof UserNotFoundException) {
            result.setState(5001);
            result.setMessage("用户数据不存在的异常");
        } else if (e instanceof PasswordNotMatchException) {
            result.setState(5002);
            result.setMessage("用户名的密码错误");
        } else if (e instanceof InsertException) {
            result.setState(5000);
            result.setMessage("注册时产生未知的异常");
        } else if (e instanceof GoodsNotFoundException) {
            result.setState(5010);
            result.setMessage("商品找不到的异常");
        } else if (e instanceof DeleteException) {
            result.setState(5011);
            result.setMessage("删除时发生异常");
        } else if (e instanceof UpdateException) {
            result.setState(5012);
            result.setMessage("更新时发生异常");
        }  else if (e instanceof SelectException) {
            result.setState(5013);
            result.setMessage("查询时产生异常");
        }
        return result;
    }

    /**
     * 获取session对象中的uid
     * @param session session对象
     * @return 当前登录的用户的uid的值
     */
    protected final Integer getuidFromSession(HttpSession session){
        try {
            Integer uid = Integer.valueOf(session.getAttribute("uid").toString());
            return uid;
        } catch (Exception e) {
            throw new UserNotLogin();
        }
    }

    /**
     * 获取当前登录用户的username
     * @param session session对象
     * @return 当前登录用户的用户名
     */
    protected final String getUsernameFromSession(HttpSession session){
        try {
            String username = session.getAttribute("username").toString();
            System.out.println(username);
            return username;
        } catch (Exception e) {
            throw new UserNotLogin();
        }
    }
}

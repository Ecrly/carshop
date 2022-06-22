package com.karl.carshop.config;


import com.karl.carshop.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/** 处理器拦截器的注册 */
@Configuration //加载当前拦截器调用并进行调用
public class LoginInterceptorCongit implements WebMvcConfigurer {


    /** 配置拦截器 */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //创建自定义的拦截器对象
        HandlerInterceptor interceptor = new LoginInterceptor();
        //配置白名单：存放在一个List集合中
        List<String> patterns = new ArrayList<>();
        patterns.add("/static/**");

        //完成拦截器的注册
        registry.addInterceptor(interceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(patterns);//表示拦截的url是什么
    }

}

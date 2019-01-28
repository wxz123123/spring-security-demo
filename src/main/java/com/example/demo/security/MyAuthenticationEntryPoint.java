package com.example.demo.security;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户未登录处理器
 * 用来解决未登录用户访问无权限资源时的异常
 * Created by Administrator on 2019/1/24.
 */
@Component
@Slf4j
public class MyAuthenticationEntryPoint implements AuthenticationEntryPoint {
    // 返回报文头 json格式，编码 utf-8
    public static final String JSON_UTF8 = "application/json;charset=utf-8";
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        log.info("------------------------------AuthenticationEntryPoint start---------------------------");
        httpServletResponse.setContentType(JSON_UTF8);
        httpServletResponse.getWriter().write(JSON.toJSONString(BaseResult.unAuthorized("用户未登录")));
    }
}

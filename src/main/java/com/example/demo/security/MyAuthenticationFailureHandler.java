package com.example.demo.security;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.BaseResult;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录失败处理
 * Created by Administrator on 2019/1/23.
 */
@Component
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {
    // 返回报文头 json格式，编码 utf-8
    public static final String JSON_UTF8 = "application/json;charset=utf-8";
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        String message;
        if (exception instanceof UsernameNotFoundException) {
            message = "用户不存在！";
        } else if (exception instanceof BadCredentialsException) {
            message = "用户名或密码错误！";
        } else if (exception instanceof LockedException) {
            message = "用户已被锁定！";
        } else if (exception instanceof DisabledException) {
            message = "用户不可用！";
        } else if (exception instanceof AccountExpiredException) {
            message = "账户已过期！";
        } else if (exception instanceof CredentialsExpiredException) {
            message = "用户密码已过期！";
        } else {
            message = "认证失败，请联系网站管理员！";
        }
        response.setContentType(JSON_UTF8);
        response.getWriter().write(JSON.toJSONString(BaseResult.error(message)));
    }
}

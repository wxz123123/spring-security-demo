package com.example.demo.security;

import com.alibaba.fastjson.JSON;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录成功处理
 * Created by Administrator on 2019/1/21.
 */
@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    // 返回报文头 json格式，编码 utf-8
    public static final String JSON_UTF8 = "application/json;charset=utf-8";
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType(JSON_UTF8);
        response.getWriter().write(JSON.toJSONString(authentication));
    }
}

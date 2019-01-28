package com.example.demo.security;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.BaseResult;
import com.example.demo.utils.RequestUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 无权限处理器
 * 用来解决登录过的用户访问无权限资源时的异常
 * Created by Administrator on 2019/1/23.
 */
@Component
public class MyAccessDeniedHandler implements AccessDeniedHandler {
    // 返回报文头 json格式，编码 utf-8
    public static final String JSON_UTF8 = "application/json;charset=utf-8";

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException exception) throws IOException, ServletException {
        /**
         * 如果是ajax访问，返回json
         * 如果是界面访问重定向到无权限界面
         */
        if (RequestUtil.isAjaxRequest(request)) {
            response.setContentType(JSON_UTF8);
            response.getWriter().write(JSON.toJSONString(BaseResult.error("您没有权限访问该资源")));
        } else {
            redirectStrategy.sendRedirect(request, response, "/unauthorized");
        }
    }
}

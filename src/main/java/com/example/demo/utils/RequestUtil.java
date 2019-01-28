package com.example.demo.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求工具类
 * Created by Administrator on 2019/1/23.
 */
public class RequestUtil {
    /**
     *  判断是否为ajax请求
     */
    public static boolean isAjaxRequest(HttpServletRequest request) {
        if (request.getHeader("accept").indexOf("application/json") > -1
                || (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").equals(
                "XMLHttpRequest"))) {
            return true;
        }
        return false;
    }
}

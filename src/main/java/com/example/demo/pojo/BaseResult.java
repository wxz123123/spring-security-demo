package com.example.demo.pojo;

import java.util.HashMap;

public class BaseResult extends HashMap<String, Object> {

    private static final long serialVersionUID = -8713837118340960775L;

    // 成功
    private static final Integer SUCCESS = 0;
    // 警告
    private static final Integer WARN = 1;
    // 异常 失败
    private static final Integer FAIL = 500;
    // 未认证
    private static final Integer UNAUTHORIZED = 401;
    // 超频
    private static final Integer OVERCLOCKING = 666;

    public BaseResult() {
        put("code", SUCCESS);
        put("msg", "操作成功");
    }

    public static BaseResult error(Object msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.put("code", FAIL);
        baseResult.put("msg", msg);
        return baseResult;
    }

    public static BaseResult warn(Object msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.put("code", WARN);
        baseResult.put("msg", msg);
        return baseResult;
    }

    public static BaseResult ok(Object data) {
        BaseResult baseResult = new BaseResult();
        baseResult.put("code", SUCCESS);
        baseResult.put("data", data);
        return baseResult;
    }

    public static BaseResult unAuthorized(Object msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.put("code", UNAUTHORIZED);
        baseResult.put("msg", msg);
        return baseResult;
    }

    public static BaseResult overClocking(Object msg) {
        BaseResult baseResult = new BaseResult();
        baseResult.put("code", OVERCLOCKING);
        baseResult.put("msg", msg);
        return baseResult;
    }

    public static BaseResult ok() {
        return new BaseResult();
    }

    public static BaseResult error() {
        return BaseResult.error("");
    }

    @Override
    public BaseResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}

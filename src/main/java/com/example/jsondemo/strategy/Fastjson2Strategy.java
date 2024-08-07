package com.example.jsondemo.strategy;


import com.alibaba.fastjson2.JSON;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/24 12:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Fastjson2Strategy implements IJsonStrategy {
    @Override
    public String toJSONString(Object obj) {
        return JSON.toJSONString(obj);
    }

    @Override
    public <T> T fromJSON(String jsonString, Class<T> clazz) {
        return JSON.parseObject(jsonString, clazz);
    }
}

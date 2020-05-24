package com.example.jsondemo.strategy;

import com.google.gson.Gson;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/24 12:51
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class GsonStrategy implements IJsonStrategy {
    @Override
    public String toJSONString(Object obj) {
        return new Gson().toJson(obj);
    }

    @Override
    public <T> T fromJSON(String jsonString, Class<T> clazz) {
        return new Gson().fromJson(jsonString, clazz);
    }
}

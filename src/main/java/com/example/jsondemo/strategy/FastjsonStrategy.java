package com.example.jsondemo.strategy;

import com.alibaba.fastjson.JSON;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/24 12:50
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class FastjsonStrategy implements IJsonStrategy {
    @Override
    public String toJSONString(Object obj) {
        return JSON.toJSONString(obj);
    }

    @Override
    public <T> T fromJSON(String jsonString, Class<T> clazz) {
        return JSON.parseObject(jsonString, clazz);
    }
}

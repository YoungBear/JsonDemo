package com.example.jsondemo.strategy;


import com.alibaba.fastjson.JSON;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2024-07-14 19:51
 * @blog <a href="https://blog.csdn.net/next_second">...</a>
 * @github <a href="https://github.com/YoungBear">...</a>
 * @description
 */
public class FastjsonStrategy implements IJsonStrategy{
    @Override
    public String toJSONString(Object obj) {
        return JSON.toJSONString(obj);
    }

    @Override
    public <T> T fromJSON(String jsonString, Class<T> clazz) {
        return JSON.parseObject(jsonString, clazz);
    }
}

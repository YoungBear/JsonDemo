package com.example.jsondemo.utils;

import com.example.jsondemo.strategy.FastjsonStrategy;
import com.example.jsondemo.strategy.IJsonStrategy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/24 12:45
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description Json工具类，使用单例模式，具体由策略实现
 */
public class JsonUtils {
    private final IJsonStrategy jsonStrategy;
    private static final JsonUtils INSTANCE = new JsonUtils(new FastjsonStrategy());

    private JsonUtils(IJsonStrategy jsonStrategy) {
        this.jsonStrategy = jsonStrategy;
    }

    public static JsonUtils getInstance() {
        return INSTANCE;
    }

    /**
     * 将对象序列化为JSON字符串
     *
     * @param obj 对象
     * @return json字符串
     */
    public String toJSONString(Object obj) {
        return jsonStrategy.toJSONString(obj);
    }

    /**
     * 将JSON字符串反序列化成对象
     *
     * @param jsonString json字符串
     * @param clazz      Class类型
     * @param <T>        具体类
     * @return 对象
     */
    public <T> T fromJSON(String jsonString, Class<T> clazz) {
        return jsonStrategy.fromJSON(jsonString, clazz);
    }
}

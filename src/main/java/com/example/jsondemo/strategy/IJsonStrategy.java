package com.example.jsondemo.strategy;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2020/5/24 11:23
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description Json策略接口
 */
public interface IJsonStrategy {
    /**
     * 将对象序列化为JSON字符串
     *
     * @param obj 对象
     * @return json字符串
     */
    String toJSONString(Object obj);

    /**
     * 将JSON字符串反序列化成对象
     *
     * @param jsonString json字符串
     * @param clazz      Class类型
     * @param <T>        具体类
     * @return 对象
     */
    <T> T fromJSON(String jsonString, Class<T> clazz);

}

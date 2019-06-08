package com.example.jsondemo.demo;

import com.example.jsondemo.entity.Student;
import com.example.jsondemo.utils.StudentUtils;
import com.google.gson.Gson;

import java.util.Map;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2019-06-08 09:11
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class MapDemo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonString1 = StudentUtils.STUDENT_STRING;
        Student student1 = gson.fromJson(jsonString1, Student.class);
        System.out.println(student1);

        Map map = gson.fromJson(jsonString1, Map.class);
        System.out.println(map);

    }
}

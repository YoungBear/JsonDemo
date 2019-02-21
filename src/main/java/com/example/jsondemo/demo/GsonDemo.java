package com.example.jsondemo.demo;

import com.example.jsondemo.entity.Student;
import com.example.jsondemo.utils.StudentUtils;
import com.google.gson.Gson;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2019/2/21 22:11
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class GsonDemo {
    public static void main(String[] args) {
        Student student = StudentUtils.genStudent();
        Gson gson = new Gson();
        String jsonString = gson.toJson(student);
        System.out.println(jsonString);

        String jsonString1 = StudentUtils.STUDENT_STRING;
        Student student1 = gson.fromJson(jsonString1, Student.class);
        System.out.println(student1);
    }
}

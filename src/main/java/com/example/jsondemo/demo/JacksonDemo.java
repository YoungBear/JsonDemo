package com.example.jsondemo.demo;

import com.example.jsondemo.entity.Student;
import com.example.jsondemo.utils.StudentUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2019/2/21 22:18
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class JacksonDemo {
    public static void main(String[] args) throws IOException {
        Student student = StudentUtils.genStudent();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(student);
        System.out.println(jsonString);

        String jsonString1 = StudentUtils.STUDENT_STRING;
        Student student1 = objectMapper.readValue(jsonString1, Student.class);
        System.out.println(student1);
    }
}

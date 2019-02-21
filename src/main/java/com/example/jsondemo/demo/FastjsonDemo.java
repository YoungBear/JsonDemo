package com.example.jsondemo.demo;

import com.alibaba.fastjson.JSON;
import com.example.jsondemo.entity.Student;
import com.example.jsondemo.utils.StudentUtils;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2019/2/21 21:58
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class FastjsonDemo {

    public static void main(String[] args) {
        Student student = StudentUtils.genStudent();
        String jsonString = JSON.toJSONString(student);
        System.out.println(jsonString);

        String jsonString1 = StudentUtils.STUDENT_STRING;
        Student student1 = JSON.parseObject(jsonString1, Student.class);
        System.out.println(student1);
    }
}

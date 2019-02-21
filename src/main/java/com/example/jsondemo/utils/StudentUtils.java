package com.example.jsondemo.utils;

import com.example.jsondemo.entity.Book;
import com.example.jsondemo.entity.Computer;
import com.example.jsondemo.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2019/2/21 21:54
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class StudentUtils {

    public static final String STUDENT_STRING = "{\"age\":24," +
            "\"bookList\":[{\"author\":\"小华\",\"name\":\"SpringBoot 实战\",\"publisher\":\"电子工业出版社\"},{\"author\":\"天天\",\"name\":\"Python 实战\",\"publisher\":\"人民日报出版社\"}]," +
            "\"computer\":{\"brand\":\"Mac\",\"price\":11089.5}," +
            "\"name\":\"小明\"}";

    public static Student genStudent() {
        Student student = new Student();
        student.setName("小明");
        student.setAge(24);
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
        book1.setName("SpringBoot 实战");
        book1.setAuthor("小华");
        book1.setPublisher("电子工业出版社");
        Book book2 = new Book();
        book2.setName("Python 实战");
        book2.setAuthor("天天");
        book2.setPublisher("人民日报出版社");
        bookList.add(book1);
        bookList.add(book2);
        student.setBookList(bookList);
        Computer computer = new Computer();
        computer.setBrand("Mac");
        computer.setPrice(11089.5F);
        student.setComputer(computer);
        return student;
    }
}

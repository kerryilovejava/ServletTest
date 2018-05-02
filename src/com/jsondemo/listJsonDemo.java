package com.jsondemo;

import com.google.gson.Gson;
import com.servlet.test.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/5/2
 * @Time 13:44
 */
public class listJsonDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s = new Student();
        s.setName("f");
        s.setAge(1);
        s.setAddress("d");
        studentList.add(s);
        studentList.add(new Student("guanyu", 13, "shanghai"));
        studentList.add(new Student("zhangfei", 14, "shanghai"));
        System.out.println(studentList);
        Gson gson = new Gson();
        String json = gson.toJson(studentList);
        System.out.println(json);

    }
}

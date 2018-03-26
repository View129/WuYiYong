package com.wyy.test;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("wuyiyong");
        Student stu2 = new Student("1234");
        Set<Student> set = new HashSet<Student>();
        set.add(stu1);
        set.add(stu2);
        set.remove(stu2);

        stu1.setName("1234");
        for (Student str : set) {
            System.out.println(str);
        }
    }
}

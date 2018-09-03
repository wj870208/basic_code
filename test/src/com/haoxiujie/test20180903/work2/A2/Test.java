package com.haoxiujie.test20180903.work2.A2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    //定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
    //	A：使用迭代器遍历集合。
    //	B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
    public static void main(String[] args) {
        ArrayList<Student> als = new ArrayList<>();
        als.add(new Student("张三", 18, "男"));
        als.add(new Student("李四", 19, "男"));
        als.add(new Student("王五", 16, "女"));
        Iterator<Student> iterator = als.iterator();
        int maxAge = 0;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAge() > maxAge) {
                maxAge = student.getAge();
            }
            System.out.println(student);
        }
        System.out.println("--------------");
        for (Student student : als) {
            if (student.getAge() == maxAge) {
                student.setName("小猪佩奇");
            }
            System.out.println(student);
        }
    }
}

package com.haoxiujie.workA8;

public class Test {
    //每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
    //如果老师给学生赋值一个负数,抛出一个自定异常
    public static void main(String[] args) {
        Student s1 = new Student(10001, "张三", -19);
        System.out.println(s1);
    }
}

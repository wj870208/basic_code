package com.haoxiujie.workB1;

import java.io.Serializable;

public class Student implements Serializable {
    //定义一个学生类，包含姓名，年龄，性别等成员变量，
    //      提供setters和getters方法以及构造方法。
    private String name;
    private int age;
    private String sex;
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

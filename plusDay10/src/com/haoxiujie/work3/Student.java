package com.haoxiujie.work3;

import java.io.Serializable;

public class Student implements Serializable {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Student() {
    }

    //1.定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,
    //      生成空参有参构造,set和get方法,toString方法
    private String name;
    private String gender;
    private int age;
    private static final long serialVersionUID = 1L;
}

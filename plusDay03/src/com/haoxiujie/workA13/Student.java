package com.haoxiujie.workA13;

import java.util.Objects;

public class Student implements Comparable<Student> {
    //姓名（String）	年龄（int）	分数（float）
    private String name;
    private int age;
    private float fs;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Float.compare(student.fs, fs) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, fs);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fs=" + fs +
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

    public float getFs() {
        return fs;
    }

    public void setFs(float fs) {
        this.fs = fs;
    }

    public Student() {
    }

    public Student(String name, int age, float fs) {
        this.name = name;
        this.age = age;
        this.fs = fs;
    }

    @Override
    public int compareTo(Student o) {
        int i = 0;
        i = (int) (o.fs - this.fs);
        if (i == 0) {
            i = this.age - o.age;
        }
        return i;
    }
}

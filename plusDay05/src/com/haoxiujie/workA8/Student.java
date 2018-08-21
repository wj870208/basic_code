package com.haoxiujie.workA8;

import java.util.Objects;

public class Student {
    //每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
    //如果老师给学生赋值一个负数,抛出一个自定异常
    private int id;
    private String name;
    private double score;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        try {
            isFushu(score);
            this.score = score;
        } catch (FushuException e) {
            e.printStackTrace();
        }
    }

    public Student() {
    }

    public Student(int id, String name, double score) {
        try {
            isFushu(score);
            this.score = score;
        } catch (FushuException e) {
            e.printStackTrace();
        }
        this.id = id;
        this.name = name;
    }

    private boolean isFushu(Double score) throws FushuException {
        if (score < 0) {
            throw new FushuException("成绩为负数: 录入失败!");
        }
        return true;
    }


}

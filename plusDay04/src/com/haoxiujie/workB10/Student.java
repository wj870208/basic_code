package com.haoxiujie.workB10;

import java.util.Objects;

public class Student {
    //属性：姓名(String name)、班级班号(String class_number)、分数(double score)
    private String name;
    private String class_number;
    private double score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", class_number='" + class_number + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(class_number, student.class_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, class_number, score);
    }

    String getClass_number() {
        return class_number;
    }

    double getScore() {
        return score;
    }

    Student(String name, String class_number, double score) {
        try {
            if (score < 0) {
                throw new FuShuException("成绩为负数~");
            }
            this.score = score;
        } catch (FuShuException e) {
            e.printStackTrace();
        }
        this.name = name;
        this.class_number = class_number;
    }
}

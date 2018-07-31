package com.haoxiujie.workA5;

public class Student {
    //    成员属性: num (学号)：int类型, score(成绩):double类型，属性使用private修饰
//    为所有属性提供set/get方法
    private int num;//学号
    private double score;//成绩

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(int num, double score) {
        this.num = num;
        this.score = score;
    }
}

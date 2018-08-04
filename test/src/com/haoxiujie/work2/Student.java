package com.haoxiujie.work2;

public class Student extends Person implements Learning {
    //1)继承Person类，重写sleep方法，方法内打印输出
    // “年龄为xxx的xx学生正在教室睡午觉”
    //PS:xxx为变量age的值，xx为变量name的值

    public Student(String name, int age) {
        super(name, age);
    }
    //   	2)成员方法：public void playGame(),方法内输出
    // “年龄为xxx的xx学生在教室玩游戏被老师抓住了

    @Override
    public void sleep() {
        System.out.println("年龄为" + getAge() + "的" + getName() + "学生正在教室睡午觉");
    }

    public void playGame() {
        System.out.println("年龄为" + getAge() + "的" + getName() + "学生在教室玩游戏被老师抓住了");
    }

    @Override
    public void study(Student stu) {
        System.out.println("学习第一,再无手机");
    }
}

package com.haoxiujie.workA4;

public class Programmer {
    //成员属性: name (姓名):String类型，age (年龄):int类型，
    // like (爱好):String类型，属性使用private修饰。
    //成员方法:
    //         1).get/set方法
    //         2).show()方法,打印对象所有属性的值;
    private String name;
    private int age;
    private String like;

    public void show() {
        System.out.println("姓名：" + name + ", 年龄：" + age + ", 爱好：" + like);
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

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public Programmer() {
    }

    public Programmer(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }
}

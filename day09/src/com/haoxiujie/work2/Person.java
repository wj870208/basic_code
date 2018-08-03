package com.haoxiujie.work2;

public class Person {//人类
    //属性：
    //			姓名name、性别gender、年龄age、国籍nationality；
    //		方法：吃饭eat、睡觉sleep，工作work。
    private String name;
    private String gender;
    private int age;
    private String nationality;

    public String eat() {
        return "吃饭...";
    }

    public String sleep() {
        return "睡觉...";
    }

    public String work() {
        return "工作...";
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Person(String name, String gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public Person() {
    }
}

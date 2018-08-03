package com.haoxiujie.work2;

public class Student extends Person {//学生类
    //增加属性：
    //			学校school、学号stuNumber；
    //		重写工作方法（学生的工作是学习）。
    private String school;
    private int stuNumber;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public Student(String name, String gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student() {
    }

    @Override
    public String work() {
        return "学习...";
    }
}

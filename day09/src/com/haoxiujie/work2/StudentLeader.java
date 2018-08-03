package com.haoxiujie.work2;

public class StudentLeader extends Student {//学生干部类
    //增加属性：
    //			职务job；
    //		增加方法：开会meeting。

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public StudentLeader() {
    }

    public StudentLeader(String name, String gender, int age, String nationality, String school, int stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    private String job;

    public String meeting() {
        return "开会...";
    }
}

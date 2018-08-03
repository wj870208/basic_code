package com.haoxiujie.work3;

public abstract class Worker {//父类
    private String name;//姓名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGz() {
        return gz;
    }

    public void setGz(double gz) {
        this.gz = gz;
    }

    public Worker() {
    }

    public Worker(String name, int id, double gz) {
        this.name = name;
        this.id = id;
        this.gz = gz;
    }

    private int id;//工号
    private double gz;//工资

    public abstract String work();//工作
}

package com.haoxiujie.work3.managerCoder;

/*
		属性：
			姓名name
			工号id
			工资salary
		行为：
			工作work()
 */
public class Coder {
    private String name;//姓名
    private int id;//工号
    private double salary;//工资

    public void work() {
        System.out.println("正在努力的写着代码......");
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Coder() {
    }
}

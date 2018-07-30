package com.haoxiujie.work3.managerCoder;

/*
属性：
			姓名name
			工号id
			工资salary
			奖金bonus
		行为：
			工作work()
 */
public class Manager {
    private String name;//姓名
    private int id;//工号
    private double salary;//工资
    private double bonus;//奖金


    public void work() {
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public Manager() {
    }
}

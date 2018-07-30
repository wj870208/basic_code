package com.haoxiujie.work3.managerCoder;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("项目经理", 123, 15000, 6000);
        Coder coder = new Coder();
        coder.setName("程序员");
        coder.setId(135);
        coder.setSalary(10000);

        System.out.print("工号为" + manager.getId() + "基本工资为" + manager.getSalary() + "奖金为" + manager.getBonus() + "的" + manager.getName());
        manager.work();
        System.out.print("工号为" + coder.getId() + "基本工资为" + coder.getSalary() + "的" + coder.getName());
        coder.work();
    }
}

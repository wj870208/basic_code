package com.haoxiujie.work3;

public class Main {
    public static void main(String[] args) {
        Xmjl xmjl = new Xmjl("项目经理", 10001, 15000, 7000);
        Cxy cxy = new Cxy("程序员", 20001, 11000);
        System.out.println(xmjl.getName() + "\t工号：" + xmjl.getId() + "\t工资：" + xmjl.getGz() + "\t奖金：" + xmjl.getJj());
        System.out.println(cxy.getName() + "\t工号：" + cxy.getId() + "\t工资" + cxy.getGz());
    }
}

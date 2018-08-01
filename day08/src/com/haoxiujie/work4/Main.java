package com.haoxiujie.work4;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("小米", 2699);
        Phone p2 = new Phone("三星", 6999);
        System.out.println("品牌：" + p1.getBrand() + ", 价格：" + p1.getPrice() + ", 尺寸：" + p1.getSize());
        System.out.println("品牌：" + p2.getBrand() + ", 价格：" + p2.getPrice() + ", 尺寸：" + p2.getSize());
    }
}

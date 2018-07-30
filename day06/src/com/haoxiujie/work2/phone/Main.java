package com.haoxiujie.work2.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("小米",998);
        System.out.print("正在使用价格为"+phone.getPrice()+"元的"+phone.getBrand()+"手机");
        phone.call();
        System.out.print("正在使用价格为"+phone.getPrice()+"元的"+phone.getBrand()+"手机");
        phone.sendMessage();
        System.out.print("正在使用价格为"+phone.getPrice()+"元的"+phone.getBrand()+"手机");
        phone.palyGame();

        Phone ph2 = new Phone();
        ph2.setBrand("锤子");
        ph2.setPrice(2699);
        System.out.print("正在使用价格为"+ph2.getPrice()+"元的"+ph2.getBrand()+"手机");
        ph2.palyGame();
    }
}

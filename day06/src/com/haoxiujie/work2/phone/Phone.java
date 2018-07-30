package com.haoxiujie.work2.phone;

/*
手机类Phone
	属性:
		品牌brand
		价格price
	行为:
		打电话call()
		发短信sendMessage()
		玩游戏playGame()
 */
public class Phone {
    private String brand;//品牌
    private double price;//价格

    public void call() {
        System.out.println("打电话...");
    }

    public void sendMessage() {
        System.out.println("发短信...");
    }

    public void palyGame() {
        System.out.println("玩游戏...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }
}

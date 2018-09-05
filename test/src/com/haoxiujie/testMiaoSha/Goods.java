package com.haoxiujie.testMiaoSha;

import java.util.Objects;

public class Goods {//商品信息类
    //秒杀商品信息的，包含字段有(商品品牌(String brand)，
    // 商品数量（int num）,商品产地（String address），
    // 商品单价（double  price）)
    private String brand;//商品品牌类
    private int num;//商品数量
    private String address;//商品产地
    private double price;//商品单价

    @Override
    public String toString() {
        return "Goods{" +
                "brand='" + brand + '\'' +
                ", num=" + num +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Double.compare(goods.price, price) == 0 &&
                Objects.equals(brand, goods.brand) &&
                Objects.equals(address, goods.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, address, price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Goods() {
    }

    public Goods(String brand, int num, String address, double price) {
        this.brand = brand;
        this.num = num;
        this.address = address;
        this.price = price;
    }
}

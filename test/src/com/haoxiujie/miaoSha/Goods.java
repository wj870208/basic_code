package com.haoxiujie.miaoSha;

import java.util.Objects;

public class Goods {
    //Goods类：秒杀商品信息的，包含字段有
    //       (商品品牌(String brand)，商品数量（int num）,
    //      商品产地（String address），商品单价（double  price）)
    private String brand;
    private int num;
    private String address;
    private double price;

    @Override
    public String toString() {
        return "Goods{" +
                "品牌='" + brand + '\'' +
                ", 数量=" + num +
                ", 产地='" + address + '\'' +
                ", 单价=" + price +
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

    String getBrand() {
        return brand;
    }

    int getNum() {
        return num;
    }

    void setNum(int num) {
        this.num = num;
    }

    String getAddress() {
        return address;
    }

    double getPrice() {
        return price;
    }

    public Goods() {
    }

    Goods(String brand, int num, String address, double price) {
        this.brand = brand;
        this.num = num;
        this.address = address;
        this.price = price;
    }
}

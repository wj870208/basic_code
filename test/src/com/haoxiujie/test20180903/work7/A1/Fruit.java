package com.haoxiujie.test20180903.work7.A1;

public class Fruit {
    //1.定义一个Fruit水果类
    //    //		成员变量：stock库存
    //    //		构造方法、set和get
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Fruit() {
    }

    public Fruit(int stock) {
        this.stock = stock;
    }
}

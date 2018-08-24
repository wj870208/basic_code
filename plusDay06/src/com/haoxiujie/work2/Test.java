package com.haoxiujie.work2;

public class Test {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Thread t1 = new Thread(bag,"官网");
        Thread t2 = new Thread(bag,"实体店");
        t1.start();
        t2.start();
    }
}

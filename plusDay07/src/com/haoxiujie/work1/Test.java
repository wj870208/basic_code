package com.haoxiujie.work1;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(100);
        NetShop netShop = new NetShop(fruit);
        FrontShop frontShop = new FrontShop(fruit);
        new Thread(netShop).start();
        new Thread(frontShop).start();
    }
}

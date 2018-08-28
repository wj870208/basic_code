package com.haoxiujie.work1;

public class FrontShop implements Runnable {
    private Fruit fruit;

    public FrontShop(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void run() {
        while (fruit.getStock() > 0) {
            synchronized (fruit) {
                if (fruit.getStock() > 0) {
                    fruit.notify();
                    int stock = fruit.getStock();
                    stock--;
                    fruit.setStock(stock);
                    System.out.println("实体店正在卖出第" + (100 - stock) + "份，还剩余" + stock + "份");
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else break;
            }
        }
    }
}

package com.haoxiujie.test20180903.work7.A1;

public class NetShop implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (fruit) {
                if (fruit.getStock() > 0) {
                    fruit.notify();
                    int count = fruit.getStock();
                    count--;
                    fruit.setStock(count);
                    System.out.print(Thread.currentThread().getName() + "正在卖出第" + (100 - count) + "份, ");
                    System.out.println("还剩余" + count + "份");
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }

    }

    //2.定义一个官网线程类：NetShop，实现Runnable接口
    //    //		完成卖出水果的动作
    private Fruit fruit;

    public NetShop(Fruit fruit) {
        this.fruit = fruit;
    }
}

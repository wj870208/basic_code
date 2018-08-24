package com.haoxiujie.work2;

public class Bag implements Runnable {
    private int bag = 100;

    @Override
    public void run() {
        int count = 0;
        while (bag > 0) {
            synchronized (this) {
                if (bag > 0) {
                    System.out.println(Thread.currentThread().getName() + ": 成功售出，还剩" + (--bag) + "个。");
                    count++;
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + "共卖出了" + count + "个");
    }
}

package com.haoxiujie.test20180903.work5.A2;

public class ThreadB extends Thread {
    @Override
    public void run() {
        //第二个线程里面实现计算1+2+3+4+....+200的和
        int count = 0;
        for (int i = 1; i < 201; i++) {
            count += i;
        }
        System.out.println(Thread.currentThread().getName() + ": " + count);
    }

    public ThreadB(String name) {
        super(name);
    }

    public ThreadB() {
    }
}

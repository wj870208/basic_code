package com.haoxiujie.test20180903.work5.A2;

public class ThreadA extends Thread {
    @Override
    public void run() {
        //第一个线程里面实现计算1+2+3+4+....+100的和
        int count = 0;
        for (int i = 1; i < 101; i++) {
            count += i;
        }
        System.out.println(Thread.currentThread().getName() + ": " + count);
    }

    public ThreadA(String name) {
        super(name);
    }

    public ThreadA() {
    }
}

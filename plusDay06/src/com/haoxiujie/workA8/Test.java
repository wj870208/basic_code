package com.haoxiujie.workA8;

public class Test {
    //编写一个Java程序，要求在同一个类中除main线程外，再开启一个线程，2个线程都循环执行20次。
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + ": 第" + (i + 1) + "次运行~");
                }
            }
        }, "次线程").start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": 第" + (i + 1) + "次运行~");
        }
    }
}

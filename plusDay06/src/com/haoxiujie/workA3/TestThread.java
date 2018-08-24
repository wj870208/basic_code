package com.haoxiujie.workA3;

public class TestThread extends Thread {
    public TestThread() {
    }

    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "执行！");
    }
}

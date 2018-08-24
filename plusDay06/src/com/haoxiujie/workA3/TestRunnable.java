package com.haoxiujie.workA3;

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "执行！");
    }
}

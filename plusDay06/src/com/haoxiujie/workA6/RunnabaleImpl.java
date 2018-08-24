package com.haoxiujie.workA6;

public class RunnabaleImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程执行");
        }
    }
}

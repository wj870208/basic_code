package com.haoxiujie.workA11;

public class BThread extends Thread {
    public BThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        String b;
        for (int i = 0; i < 100000; i++) {
            b = "黑马程序员";
        }
        long end = System.currentTimeMillis();
        System.out.println("BThread: " + (end - begin) + "ms");
    }
}

package com.haoxiujie.workA11;

public class CThread extends Thread {
    public CThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        String b;
        for (int i = 0; i < 100000; i++) {
            b = "黑马程序员" + i;
        }
        long end = System.currentTimeMillis();
        System.out.println("CThread: " + (end - begin) + "ms");
    }
}

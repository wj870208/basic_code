package com.haoxiujie.workA11;

import java.util.Objects;

public class AThread extends Thread {
    public AThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        Integer a;
        for (int i = 0; i < 100000; i++) {
            a = i;
        }
        long end = System.currentTimeMillis();
        System.out.println("AThread: " + (end - begin) + "ms");
    }
}

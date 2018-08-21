package com.haoxiujie.workA9;

public class AThread extends Thread {
    public AThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println("子线程: " + i);
            }
        }
    }
}

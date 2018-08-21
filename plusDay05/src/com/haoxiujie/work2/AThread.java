package com.haoxiujie.work2;

public class AThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        for (int i = 1; i < 101; i++) {
            count += i;
        }
        System.out.println("a: " + count);
    }
}

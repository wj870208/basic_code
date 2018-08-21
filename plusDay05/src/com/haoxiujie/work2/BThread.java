package com.haoxiujie.work2;

public class BThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        for (int i = 1; i < 201; i++) {
            count += i;
        }
        System.out.println("b: " + count);
    }
}

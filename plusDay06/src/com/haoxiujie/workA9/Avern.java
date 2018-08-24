package com.haoxiujie.workA9;

public class Avern implements Runnable {
    int i = 0;

    @Override
    public void run() {
        synchronized (this) {
            i++;
            System.out.print(Thread.currentThread().getName() + "正第" + i + "个过此山洞");
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    System.out.print(".");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("已通过山洞" + i + "人");
        }
    }
}

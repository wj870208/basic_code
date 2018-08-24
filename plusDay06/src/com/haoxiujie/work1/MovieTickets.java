package com.haoxiujie.work1;

public class MovieTickets implements Runnable {
    private int ticket = 1000;

    @Override
    public void run() {
        while (ticket > 0) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + ": 领取中,请稍后...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": 领取成功，还剩" + (--ticket) + "张余票。\n");
            }
        }
    }
}

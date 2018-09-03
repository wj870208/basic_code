package com.haoxiujie.test20180903.work6.A1;

public class MT implements Runnable {
    //一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
    //	要求:请用多线程模拟卖票过程并打印剩余电影票的数量
    private int count = 1000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (count > 0) {
                    System.out.print(Thread.currentThread().getName() + "销售中...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                    System.out.println("销售成功，余票" + count + "。");
                } else {
                    break;
                }
            }
        }
    }
}

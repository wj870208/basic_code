package com.haoxiujie.test20180903.work6.A2;

public class Bag implements Runnable {
    //有一个包包的数量为100个。分别从实体店和官网进行售卖！
    //	要求使用多线程的方式，分别打印实体店和官网卖出包包的信息！
    //	分别统计官网和实体店各卖出了多少个包包，例如：
    //	官网共卖出了45个
    //	实体店共卖出了55个
    private int count = 100;

    @Override
    public void run() {
        int thisCount = 0;
        while (true) {
            synchronized (this) {
                if (count > 0) {
                    System.out.print(Thread.currentThread().getName() + "正在售卖中...");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                    thisCount++;
                    System.out.println("售卖成功，本店已售" + thisCount + ", 库存" + count + "。");
                } else {
                    System.out.println(Thread.currentThread().getName() + "共卖出了" + thisCount + "个。");
                    break;
                }
            }
        }
    }
}

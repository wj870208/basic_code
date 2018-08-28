package com.haoxiujie.test1baoza.test1;

public class ShengChanZhe extends Thread {
    private Baozi bz;

    public ShengChanZhe(Baozi bz) {
        this.bz = bz;
    }

    //生产者：生产包子
    //      1.锁资源，判断有没有包子
    //      2.没有包子，制作包子。状态变成有包子
    //      3.制作完成/有包子，变为等待状态，唤醒消费者，锁结束
    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.isYouBaoZi()) {
                    try {
                        bz.wait();//有包子，我等
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有的话继续：
                System.out.println("正在制作包子");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                switch (count % 5) {
                    case 0:
                        bz.setXian("三鲜馅包子");
                        break;
                    case 1:
                        bz.setXian("牛肉馅包子");
                        break;
                    case 2:
                        bz.setXian("韭菜馅包子");
                        break;
                    case 3:
                        bz.setXian("茄子馅包子");
                        break;
                    case 4:
                        bz.setXian("甜不辣包子");
                        break;
                }
                count++;
                bz.setYouBaoZi(true);
                System.out.println(bz.getXian() + "制作完成！");
                bz.notify();
            }
        }
    }

}

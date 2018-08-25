package com.haoxiujie.test1;

public class XiaoFeiZhe extends Thread {
    private Baozi bz;

    public XiaoFeiZhe(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (!bz.isYouBaoZi()) {
                    try {
                        bz.wait();//没有包子，我等
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //有包子了。继续：
                System.out.println("正在吃" + bz.getXian());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.setYouBaoZi(false);
                System.out.println("吃完了");
                System.out.println("---------------");
                bz.notify();
            }
        }
    }

}

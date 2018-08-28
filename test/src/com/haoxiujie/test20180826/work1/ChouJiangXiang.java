package com.haoxiujie.test20180826.work1;

import java.util.ArrayList;

public class ChouJiangXiang implements Runnable {
    private JiangPin jp;

    public ChouJiangXiang(JiangPin jp) {
        this.jp = jp;
    }

    @Override
    public void run() {
        ArrayList<String> cjx = new ArrayList<>();
        while (true) {
            synchronized (jp) {
                if (jp.shengyu() > 0) {
                    String choujiang = jp.choujiang();
                    cjx.add(choujiang);
                } else {
                    if (cjx.size() > 0) {
                        System.out.println("在此次抽奖过程中，" + Thread.currentThread().getName() + "共产生了" + cjx.size() + "个奖项，分别为：" + cjx);
                    } else {
                        System.out.println("在此次抽奖过程中，" + Thread.currentThread().getName() + "没有抽到奖项，下次努力~");
                    }
                    break;
                }
            }
        }
    }
}

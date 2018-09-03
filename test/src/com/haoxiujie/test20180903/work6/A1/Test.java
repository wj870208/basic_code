package com.haoxiujie.test20180903.work6.A1;

public class Test {
    //一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
    //	要求:请用多线程模拟卖票过程并打印剩余电影票的数量
    public static void main(String[] args) {
        MT mt = new MT();
        new Thread(mt, "窗口一").start();
        new Thread(mt, "窗口二").start();
    }
}

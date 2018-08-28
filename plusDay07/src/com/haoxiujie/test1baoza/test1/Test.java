package com.haoxiujie.test1baoza.test1;

public class Test {
    //生产者-消费者问题
    //资源类：包子    陷属性  状态
    //生产者：生产包子
    //      1.锁资源，判断有没有包子
    //      2.没有包子，让消费者等待，制作包子。状态变成有包子
    //      3.制作完成/有包子，唤醒消费者，锁结束
    //消费者：吃包子
    //      1.锁资源，判断有没有包子
    //      2.有包子，让生产者等待，吃包子，状态变成没包子
    //      3.吃完成/没包子，唤醒生产者，锁结束
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        XiaoFeiZhe xfz = new XiaoFeiZhe(bz);
        ShengChanZhe scz = new ShengChanZhe(bz);
        xfz.setName("消费者");
        scz.setName("生产者");
        xfz.start();
        scz.start();
    }
}

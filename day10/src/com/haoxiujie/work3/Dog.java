package com.haoxiujie.work3;

public class Dog extends Animal implements Yy {
    //行为:
    //			吃饭(啃骨头)和 游泳(狗刨)
    @Override
    public void cdx() {
        System.out.println("啃骨头");
    }

    @Override
    public void yy() {
        System.out.println("狗会狗刨游泳");
    }
}

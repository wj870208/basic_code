package com.haoxiujie.workA3;

public interface Lanya {
    //定义抽象方法： void btFunction()
    //        定义默认方法： void connecting()，要求：输出"可以连接蓝牙
    public abstract void btFunction();

    public default void connecting() {
        System.out.println("可以连接蓝牙");
    }
}

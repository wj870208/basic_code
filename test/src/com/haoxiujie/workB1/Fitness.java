package com.haoxiujie.workB1;

public abstract interface Fitness {
    public abstract void fitnessPlan(Plan p);

    public default void info() {
        sport1();
        sport2();
    }

    public static void sport1() {
        System.out.println("每天动一动，享受健康生活");
    }

    public static void sport2(){
        System.out.println("记得要做热身运动哦");
    }
}

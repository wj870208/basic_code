package com.haoxiujie.workA10;

public class Test {
    //在一款角色扮演游戏中,每一个人都会有名字和生命值;角色的生命值不能为负数
    //要求:当一个人物的生命值为负数的时候需要抛出自定的异常
    public static void main(String[] args) {
        Penson p1 = new Penson("聂逍遥", -111);
    }
}

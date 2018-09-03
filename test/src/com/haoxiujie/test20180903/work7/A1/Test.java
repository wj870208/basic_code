package com.haoxiujie.test20180903.work7.A1;

import java.io.File;

public class Test {
    //1.定义一个Fruit水果类
    //		成员变量：stock库存
    //		构造方法、set和get
    //	2.定义一个官网线程类：NetShop，实现Runnable接口
    //		完成卖出水果的动作
    //	3.定义一个实体店线程类：FrontShop，实现Runnable接口
    //		完成卖出水果的动作
    //	4.使用等待唤醒机制完成卖出100份坚果的功能
    //		例如：
    //			官网正在卖出第1份，还剩余99份
    //			实体店正在卖出第2份，还剩余98份
    //			官网正在卖出第3份，还剩余97份
    //			实体店正在卖出第4份，还剩余96份
    //			...
    public static void main(String[] args) {
        Fruit fruit = new Fruit(100);
        new Thread(new NetShop(fruit), "官网").start();
        new Thread(new FrontShop(fruit), "实体店").start();
    }
}

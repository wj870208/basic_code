package com.haoxiujie.test20180903.work5.A2;

public class Test {
    //二、请使用继承Thread类的方式开启两个线程
    //		(1)第一个线程的名字设置为：a   第二个线程的名字设置为：b
    //		(2)第一个线程里面实现计算1+2+3+4+....+100的和
    //		(3)第二个线程里面实现计算1+2+3+4+....+200的和
    //		程序最终打印结果：
    //				a:5050
    //				b:20100   (a和b的打印顺序不作要求)
    public static void main(String[] args) {
        new ThreadA("a").start();
        new ThreadB("b").start();
    }
}

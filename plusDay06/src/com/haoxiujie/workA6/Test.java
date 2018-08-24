package com.haoxiujie.workA6;

public class Test {
    //编写程序，在主线程中，循环输出“主线程执行”；
    // 在一条新线程中，循环输出“子线程执行”
    public static void main(String[] args) {
        RunnabaleImpl runnabaleimpl = new RunnabaleImpl();
        Thread tr = new Thread(runnabaleimpl);
        tr.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程执行");
        }
    }
}

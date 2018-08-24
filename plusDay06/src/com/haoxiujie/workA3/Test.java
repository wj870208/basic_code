package com.haoxiujie.workA3;

public class Test {
    //请编写程序，分别打印主线程的名称和子线程的名称。
    //		要求使用两种方式实现：
    //			第一种方式：继承Thread类。
    //			第二种方法：实现Runnable接口。
    public static void main(String[] args) {
        TestThread tt = new TestThread("Thread");
        TestRunnable testRunnable = new TestRunnable();
        Thread tr = new Thread(testRunnable, "Runnable");
        tt.start();
        tr.start();
    }
}

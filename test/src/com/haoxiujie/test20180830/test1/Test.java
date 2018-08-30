package com.haoxiujie.test20180830.test1;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());
        pool.shutdown();
    }
}

package com.haoxiujie.work1;

public class Test {
    public static void main(String[] args) {
        MovieTickets mt = new MovieTickets();
        Thread t1 = new Thread(mt, "1号窗口");
        Thread t2 = new Thread(mt, "2号窗口");
        t1.start();
        t2.start();
    }
}

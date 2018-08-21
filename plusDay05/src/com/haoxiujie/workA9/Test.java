package com.haoxiujie.workA9;

public class Test {
    //创建多线程对象，开启多线程。在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。
    public static void main(String[] args) {
        AThread at = new AThread("AT");
        at.start();
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.println("主线程: " + i);
            }
        }
    }
}

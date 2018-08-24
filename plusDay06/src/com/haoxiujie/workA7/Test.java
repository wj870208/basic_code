package com.haoxiujie.workA7;

public class Test {
    //编写程序，创建两个线程对象，一根线程循环输出“播放背景音乐”，
    // 另一根线程循环输出“显示画面”，要求线程实现Runnable接口，且使用匿名内部类实现
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("播放背景音乐：" + i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("显示画面：" + i);
                }
            }
        }).start();
    }
}

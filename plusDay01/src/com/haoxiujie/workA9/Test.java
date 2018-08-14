package com.haoxiujie.workA9;

public class Test {
    //分别使用String的+=和StringBuilder的append方法对字符串做100000次拼接，
    // 计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test2() {
        long begin = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("使用StringBuilder拼接100000次花费时间为：" + (end - begin) + "ms");
    }

    private static void test1() {
        long begin = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("使用String拼接100000次花费时间为：" + (end - begin) + "ms");
    }
}

package com.haoxiujie.test20180903.work8.A2;

public class Test {
    //第二题：使用递归计算1-5的阶乘
    public static void main(String[] args) {
        int i = jieCheng(5);
        System.out.println(i);
    }

    private static int jieCheng(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * jieCheng(i - 1);
        }
    }
}

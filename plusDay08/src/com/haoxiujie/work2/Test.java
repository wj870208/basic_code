package com.haoxiujie.work2;

public class Test {
    //使用递归计算1-5的阶乘
    public static void main(String[] args) {
        int i = jC(1, 5);
        System.out.println(i);
    }

    private static int jC(int begin, int end) {
        if (begin == end) {
            return end;
        } else {
            return begin * jC(begin + 1, end);
        }
    }
}

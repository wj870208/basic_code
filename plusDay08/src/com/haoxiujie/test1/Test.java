package com.haoxiujie.test1;

public class Test {
    public static void main(String[] args) {
        System.out.println(jC(10));
    }

    private static int jC(int i) {
        if (i == 1) {
            return 1;
        }
        return i * jC(i - 1);
    }
}

package com.haoxiujie.test2;

public class Test {
    public static void main(String[] args) {
        biaoji:// 在外层做标记:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j % 2 == 0) {
                    continue;//跳出里层循环
                }
                if (i % 3 == 0) {
                    continue biaoji;//跳出循环到标记处，即跳出外层循环
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}

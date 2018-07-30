package com.haoxiujie.day05.work;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        System.out.print("请输入到第几个月的情况：");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int rb = 1;
        int qrb = 0;
        for (int i = 2; i <= a; i++) {
            int temp;
            temp = rb;
            rb += qrb;
            qrb = temp;
        }
        System.out.println(rb);
    }
}

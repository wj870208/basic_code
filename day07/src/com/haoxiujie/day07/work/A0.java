package com.haoxiujie.day07.work;

import java.util.Random;
import java.util.Scanner;

public class A0 {
    public static void main(String[] args) {
        Random sc = new Random();
        System.out.print("依次输入若干个数字，程序将输出最大值。\n请先输入您要输入多少个数字：");
        int sl = 99999999;
        System.out.println("请开始输入数字：");
        int max = sc.nextInt();
        for (int i = 0; i < sl-1; i++) {
            int a = sc.nextInt();
            if (a>max){
                max = a;
            }
        }
        System.out.print("最大值是："+ max);
    }
}
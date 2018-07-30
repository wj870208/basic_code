package com.haoxiujie.work2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1.通过键盘录入一个数字，作为数组的长度
//        2.根据录入的数字，创建一个长度为该数字的数组
//        3.通过随机数为数组中的每个元素进行赋值。随机数的范围在1-100之间
//        4.求出数组中最大数字
//        5.求出数组中的数字平均值
        System.out.print("请输入数组的长度：");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] arri = new int[sc.nextInt()];
        int max = 0;//最大值
        int add = 0;//累加值
        for (int i = 0; i < arri.length; i++) {
            arri[i] = rd.nextInt(100) + 1;
            if (arri[i] > max) {
                max = arri[i];
            }
            add += arri[i];
        }
        System.out.println("数组中最大数字是：" + max);
        System.out.println("数组中数字平均值：" + add / arri.length);
    }
}

package com.haoxiujie.countingSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("您输入需要排序的数量：");
        Scanner sc = new Scanner(System.in);
        int[] arri = new int[sc.nextInt()];
        System.out.println("请依次输入需要排序的" + arri.length + "个数：（暂时需要非负数）");
        for (int i = 0; i < arri.length; i++) {
            arri[i] = sc.nextInt();
        }

        CountingSort.countingSort(arri);//计数排序

        for (int i = 0; i < arri.length; i++) {
            System.out.print(arri[i] + "\t");
        }
    }
}
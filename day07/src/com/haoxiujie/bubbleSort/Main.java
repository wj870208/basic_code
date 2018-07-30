package com.haoxiujie.bubbleSort;

import java.util.Scanner;

public class Main {
    // 用Java实现冒泡排序      冒泡排序的时间复杂度是n²，因此并不是最好的排序算法。
    public static void main(String[] args) {
        System.out.print("您输入需要排序的数量：");
        Scanner sc = new Scanner(System.in);
        int[] arri = new int[sc.nextInt()];
        System.out.println("请依次输入需要排序的" + arri.length + "个数：");
        for (int i = 0; i < arri.length; i++) {
            arri[i] = sc.nextInt();
        }

        //开始排序 从小到大
        for (int j = arri.length; j > 0; j--) {
            for (int i = 1; i < j; i++) {
                if (arri[i - 1] > arri[i]) {
                    int temp = arri[i - 1];
                    arri[i - 1] = arri[i];
                    arri[i] = temp;
                }
            }
        }

        for (int i = 0; i < arri.length; i++) {
            System.out.print(arri[i] + "\t");
        }

    }
}

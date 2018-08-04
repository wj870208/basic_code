package com.haoxiujie.workA1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //定义一个长度为10的int型数组arr，数组元素为50-60（范围包含50和60）之间的随机数
    //        提示用户输入2-6之间的一个数字num（num范围包括2和5,不需要代码判断）
    //        遍历数组arr,筛选出数组中元素是num倍数的数组元素并输出
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(11) + 50;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个2~6之间的一个数字：");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}

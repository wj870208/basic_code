package com.haoxiujie.work;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] fs=  new int[6];
        for (int i = 0; i < fs.length; i++) {
            System.out.print("请输入第"+(i+1)+"个打分分数：");
            fs[i] = in.nextInt();
        }
        System.out.println("去掉一个最低分和一个最高分后的平均分是："+ pjf(fs));
    }

    private static int pjf(int[] fs) {
        int min = fs[0];
        int max = fs[0];
        int add = fs[0];
        for (int i = 1; i < fs.length; i++) {
            if (fs[i]>max){
                max = fs[i];
            }
            if (fs[i]<min){
                min = fs[i];
            }
            add += fs[i];
        }
        return (add-max-min)/(fs.length-2);
    }
}

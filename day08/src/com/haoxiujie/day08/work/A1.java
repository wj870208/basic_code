package com.haoxiujie.day08.work;

import java.util.Scanner;

public class A1 {
    //统计输入的字符串中各种字符的个数

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int countdx = 0;//大写
        int countxx = 0;//小写
        int sz = 0;//数字
        int qt = 0;//其他
        char[] csrt = str.toCharArray();
        for (int i = 0; i < csrt.length; i++) {
            if (csrt[i] >= 'A' && csrt[i] <= 'Z') {
                countdx++;
            } else if (csrt[i] >= 'a' && csrt[i] <= 'z') {
                countxx++;
            } else if (csrt[i] >= '0' && csrt[i] <= '9') {
                sz++;
            } else {
                qt++;
            }
        }
        System.out.println("大写字母有" + countdx + "个, 小写字母有" + countxx + "个, 数字有" + sz + "个, 其他字符有" + qt + "个");
    }
}

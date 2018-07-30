package com.haoxiujie.work3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1.创建一个ArrayList集合，用于存储一些字符串
//        2.通过键盘录入5个字符串，保存到集合中
//        3.遍历集合，打印每一个字符串
        ArrayList<String> arrs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arrs.add(sc.next());
        }

        for (int i = 0; i < arrs.size(); i++) {
            System.out.println(arrs.get(i));
        }
    }
}

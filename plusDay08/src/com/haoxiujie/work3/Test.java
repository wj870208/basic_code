package com.haoxiujie.work3;

import java.io.File;
import java.util.Scanner;

public class Test {
    //使用文件过滤器来打印出D盘下的所有.txt文件名称
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入路径：");
        File file = new File(sc.next());
        printTxtName(file);
    }

    private static void printTxtName(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                printTxtName(f);
            } else {
                if (f.getName().toLowerCase().endsWith(".txt")) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}

package com.haoxiujie.test20180903.work8.A3;

import java.io.File;

public class Test {
    //使用文件过滤器来打印出D盘下的所有.txt文件名称
    public static void main(String[] args) {
        File file = new File("D:\\");
        showAllTxt(file);
    }

    private static void showAllTxt(File file) {
        try {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    showAllTxt(f);
                }
            } else {
                if (file.getName().toLowerCase().endsWith(".txt")) {
                    System.out.println(file.toString());
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e+": "+file.toString());
        }

    }
}

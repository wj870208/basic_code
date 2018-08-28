package com.haoxiujie.workA4;

import java.io.File;

public class Test {
    //获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
    public static void main(String[] args) {
        File file = new File("plusDay08\\src\\com\\haoxiujie\\workB2");
        File[] files = file.listFiles(f -> f.getName().toLowerCase().endsWith(".java"));
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}

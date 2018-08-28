package com.haoxiujie.work1;

import java.io.File;
import java.util.ArrayList;

public class Test {
    //练习File类的常用方法
    public static void main(String[] args) {
        File file = new File("D:\\资料");
        showFileAll(file);
    }

    private static void showFileAll(File file) {//使用循环实现遍历文件
        ArrayList<File> alf = new ArrayList<>();
        alf.add(file);
        do {
            file = alf.remove(0);
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    alf.add(f);
                } else {
                    System.out.println(f);
                }
            }
        } while (alf.size() > 0);
    }
}

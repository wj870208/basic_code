package com.haoxiujie.work1;

import java.io.File;
import java.util.LinkedList;

public class Test {
    //练习File类的常用方法
    public static void main(String[] args) {
        File file = new File("D:\\沙箱");
        showFileAll(file);
        deleteFileAll(file);
    }

    private static void deleteFileAll(File file) {//使用循环实现删除全部文件
        LinkedList<File> alf = new LinkedList<>();
        LinkedList<File> dir = new LinkedList<>();
        alf.add(file);
        do {
            file = alf.remove(0);
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    alf.add(f);
                } else {
                    f.delete();
                }
            }
            dir.add(file);
        } while (alf.size() > 0);
        for (int i = dir.size() - 1; i >= 0; i--) {
            dir.get(i).delete();
        }
    }

    private static void showFileAll(File file) {//使用循环实现遍历文件
        LinkedList<File> alf = new LinkedList<>();
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

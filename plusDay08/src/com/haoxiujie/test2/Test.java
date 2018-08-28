package com.haoxiujie.test2;

import java.io.File;
import java.io.FileFilter;

public class Test {
    public static void main(String[] args) {
        File file = new File("D:\\JavaDev");
        showFileAll(file);
    }

    private static void showFileAll(File file) {
        System.out.println(file.getAbsolutePath());
        File[] files = file.listFiles(pathname -> pathname.getName().toLowerCase().endsWith(".java") || pathname.isDirectory());
        for (File f : files) {
            if (f.isDirectory()) {
                showFileAll(f);
            } else {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}

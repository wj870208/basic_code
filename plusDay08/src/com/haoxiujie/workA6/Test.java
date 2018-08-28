package com.haoxiujie.workA6;

import java.io.File;
import java.util.Scanner;

public class Test {
    //从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        int i = sizeAllFile(file);
        System.out.println(i);
    }

    private static int sizeAllFile(File file) {
        int count = 0;
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                count += sizeAllFile(f);
            } else {
                count += f.length();
            }
        }
        return count;
    }
}

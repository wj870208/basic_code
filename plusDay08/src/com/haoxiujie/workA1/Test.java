package com.haoxiujie.workA1;

import java.io.File;
import java.util.Scanner;

public class Test {
    //键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
    //如果是文件，则输出文件的大小
    //如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        if (file.isFile()) {
            System.out.println("文件大小：" + file.length());
        } else {
            int count = 0;
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isFile()) {
                    count += f.length();
                }
            }
            System.out.println("文件夹大小：" + count);
        }
    }
}

package com.haoxiujie.workA5;

import java.io.File;
import java.util.Scanner;

public class Test {
    //键盘录入一个文件夹路径，删除该文件夹以及文件夹路径下的所有文件。
    //要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
    //提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        deleteAllFile(file);
    }

    private static void deleteAllFile(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                deleteAllFile(f);
            }
            f.delete();
        }
        file.delete();
    }
}

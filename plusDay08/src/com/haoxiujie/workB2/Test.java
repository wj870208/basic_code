package com.haoxiujie.workB2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    //1.打印指定目录(不包含子目录)下所有的txt文件的名称(不打印文件夹路径)
    //	2.获取指定目录(包含子目录)下所有的txt文件的个数,并打印文件名称
    //	3.定义工具类IOUtils，里面有个方法描述如下(自行查找String类的API)：
    //		public static ArrayList<String> getAllFileNames2List(File srcDir,String fileType)
    //			参数File srcDir:源文本文件
    //			参数String fileType:文件类型(比如：.doc,.txt,.java)
    //			要求：将srcDir文件夹(包含子文件)所有扩展名为fileType的文件名称存入ArrayList<String>集合并返回
    //	4.测试IOUtils工具类中的方法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入目录路径：");
        File file = new File(sc.next());
        printTxtName(file);
        System.out.println("\n----------------------------------------\n");
        printTxtNameAll(file);
        System.out.println("\n----------------------------------------\n");
        ArrayList<String> list = IOUtils.getAllFileNames2List(file, ".mp4");
        System.out.println("共有" + list.size() + "个mp4类型的文件，它们是：");
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void printTxtNameAll(File file) {
        ArrayList<File> alf = new ArrayList<>();
        printTxtNameAll(file, alf);
        System.out.println("此目录及其子目录中共有txt文件" + alf.size() + "个。它们是：");
        for (File f : alf) {
            System.out.println(f.getName());
        }
    }

    private static void printTxtNameAll(File file, ArrayList<File> alf) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                printTxtNameAll(f, alf);
            } else {
                if (f.getName().toLowerCase().endsWith(".txt")) {
                    alf.add(f);
                }
            }
        }
    }


    private static void printTxtName(File file) {
        System.out.println("此目录下的txt文件有：");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.getName().toLowerCase().endsWith(".txt")) {
                System.out.println(f.getName());
            }
        }
    }
}

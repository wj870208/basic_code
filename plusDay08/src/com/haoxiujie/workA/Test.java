package com.haoxiujie.workA;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //创建两个文件对象，分别使用相对路径和绝对路径创建。
        test01();
        //检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
        test02();
        //在D盘下创建一个名为bbb的文件夹。
        test03();
        //在D盘下创建一个名为ccc的文件夹，ccc文件夹中要求包含bbb子文件夹,bbb子文件夹要求包含aaa文件夹
        test04();
        //将D盘下a.txt文件删除, 将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
        test05();
        //获取D盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，
        // 并将信息输出在控制台。
        test06();
        //1.判断File对象是否文件,是文件则输出：xxx是一个文件，否则输出：xxx是不是一个文件。
        //2.判断File对象是否文件夹,是文件夹则输出：xxx是一个文件夹，
        //      否则输出：xxx是不是一个文件夹。(xxx是文件名或文件夹名)
        test07();
        //获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
        //注意：不包含子文件夹下的文件
        test08();
    }

    private static void test08() {
        File file = new File("plusDay08\\src\\com\\haoxiujie\\workA");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }

    private static void test07() {
        File file = new File("D:\\JavaDev\\IdeaProjects\\basic_code\\plusDay08\\src\\com\\haoxiujie\\workA\\相对路径.bin");
        if (file.isFile()) {
            System.out.println(file.getName() + "是一个文件");
        } else {
            System.out.println(file.getName() + "不是一个文件");
        }
        if (file.isDirectory()) {
            System.out.println(file.getName() + "是一个文件夹");
        } else {
            System.out.println(file.getName() + "不是一个文件夹");
        }
    }

    private static void test06() {
        File file = new File("D:\\JavaDev\\IdeaProjects\\basic_code\\plusDay08\\src\\com\\haoxiujie\\workA\\相对路径.bin");
        System.out.println("文件名：" + file.getName() + ", 文件大小：" + file.length());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("父路径：" + file.getParentFile().getAbsolutePath());
    }

    private static void test05() {
        File a = new File("plusDay08\\src\\com\\haoxiujie\\workA\\a.txt");
        a.delete();
        File b = new File("plusDay08\\src\\com\\haoxiujie\\workA\\bbb");
        b.delete();
    }

    private static void test04() {
        File file = new File("plusDay08\\src\\com\\haoxiujie\\workA\\ccc\\bbb\\aaa");
        file.mkdirs();
    }

    private static void test03() {
        File file = new File("plusDay08\\src\\com\\haoxiujie\\workA\\bbb");
        file.mkdir();
    }

    private static void test02() throws IOException {
        File file = new File("plusDay08\\src\\com\\haoxiujie\\workA\\a.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private static void test01() throws IOException {
        File file1 = new File("plusDay08\\src\\com\\haoxiujie\\workA\\相对路径.bin");
        file1.createNewFile();
        File file2 = new File("D:\\JavaDev\\IdeaProjects\\basic_code\\plusDay08\\src\\com\\haoxiujie\\workA\\绝对路径.bin");
        file2.createNewFile();
    }
}

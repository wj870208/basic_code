package com.haoxiujie;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class DoNotStart {
    public static void main(String[] args) {
        System.out.println("本程序将尽力删除您C盘的所有文件。请输入以下内容以继续：");
        String s = "我了解这个程序的功能 所有后果由我本人承担";
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        String scan = sc.nextLine();
        if (!s.equals(scan)) {
            return;
        }
        File file = new File("D:\\沙箱");
        deleteFileAll(file);
    }

    private static void deleteFileAll(File file) {
        LinkedList<File> alf = new LinkedList<>();
        LinkedList<File> dir = new LinkedList<>();
        alf.add(file);
        do {
            file = alf.removeFirst();
            try {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (f.isDirectory()) {
                        alf.add(f);
                    } else {
                        f.delete();
                    }
                }
                dir.add(file);
            } catch (Exception e) {
                continue;
            }
        } while (alf.size() > 0);
        while (dir.size() > 0) {
            try {
                dir.removeLast().delete();
            } catch (Exception e) {
                continue;
            }
        }
    }
}

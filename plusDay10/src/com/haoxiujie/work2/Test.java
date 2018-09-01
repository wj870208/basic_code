package com.haoxiujie.work2;

import java.io.*;
import java.util.Scanner;

public class Test {
    //	1.从键盘接收一个小视频路径
    //	2.将这个视频复制到D盘下avi文件中
    //	3.要求使用缓冲流来实现
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个avi格式视频的路径：");
        try (BufferedInputStream bif = new BufferedInputStream(new FileInputStream(sc.nextLine()));
             BufferedOutputStream bof = new BufferedOutputStream(new FileOutputStream("D:\\test.avi"))) {
            byte[] bytes = new byte[8192];
            int len;
            while ((len = bif.read(bytes)) != -1) {
                bof.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

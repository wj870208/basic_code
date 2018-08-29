package com.haoxiujie.workA3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    //在D盘下，有一c.txt 文件中内容为：HelloWorld
    //在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
    //利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("plusDay09\\src\\com\\haoxiujie\\workA3\\c.txt", true)) {
            fos.write("\r\nI love Java".getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

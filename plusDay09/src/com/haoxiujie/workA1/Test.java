package com.haoxiujie.workA1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        //利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
        try (FileOutputStream fos = new FileOutputStream("plusDay09\\src\\com\\haoxiujie\\workA1\\a.txt")) {
            fos.write("a".getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

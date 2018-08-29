package com.haoxiujie.workA2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    //利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("plusDay09\\src\\com\\haoxiujie\\workA2\\b.txt")) {
            byte[] bytes = "I love Java".getBytes();
            for (byte b : bytes) {
                fos.write(b);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

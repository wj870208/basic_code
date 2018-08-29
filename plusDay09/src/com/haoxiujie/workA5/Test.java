package com.haoxiujie.workA5;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    //利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
    //,     使用循环读取，一次读取一个字节数组，
    //      直到读取到文件末尾，将读取到的字节数组转换成字符串输出到控制台。
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("plusDay09\\src\\com\\haoxiujie\\workA5\\b.txt")) {
            byte[] bytes = new byte[1024];
            int len;
            String s = new String();
            while ((len = fis.read(bytes)) != -1) {
                s += new String(bytes, 0, len);
            }
            System.out.println(s);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

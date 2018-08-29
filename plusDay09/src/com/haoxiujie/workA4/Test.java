package com.haoxiujie.workA4;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    //利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
    //,使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字节输出到控制台
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("plusDay09\\src\\com\\haoxiujie\\workA4\\a.txt")) {
            int len;
            while ((len = fis.read()) != -1) {
                System.out.print((char) len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

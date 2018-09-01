package com.haoxiujie.workA6;

import java.io.*;

public class Test {
    //利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，
    // 并打印在控制台上。
    //要求：不能出现乱码的情况。
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("plusDay10\\src\\com\\haoxiujie\\workA6\\a.txt"), "GBK");
        char[] chars = new char[1024];
        int len;
        StringBuilder s = new StringBuilder();
        while ((len = isr.read(chars)) != -1) {
            s.append(new String(chars, 0, len));
        }
        System.out.println(s.toString());
        isr.close();
    }
}

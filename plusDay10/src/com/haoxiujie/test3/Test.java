package com.haoxiujie.test3;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File utf8 = new File("plusDay10\\src\\com\\haoxiujie\\test3\\utf8.txt");
        File gbk = new File("plusDay10\\src\\com\\haoxiujie\\test3\\gbk.txt");

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(utf8), "UTF-8");
        osw.write("大家好，我是UTF-8编码的文件~");
        osw.flush();
        osw.close();

        osw = new OutputStreamWriter(new FileOutputStream(gbk), "GBK");
        osw.write("大家好，我是GBK编码的文件~");
        osw.flush();
        osw.close();
    }
}

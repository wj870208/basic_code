package com.haoxiujie.workA1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    //利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("plusDay10\\src\\com\\haoxiujie\\workA1\\d.txt"));
        bos.write(101);
        bos.close();
    }
}

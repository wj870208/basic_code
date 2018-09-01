package com.haoxiujie.workA3;

import java.io.*;

public class Test {
    //描述:利用高效字节输入流和高效字节输出流完成文件的复制。
    //1.将C盘下的c.png文件复制到D盘下
    //2.一次读写一个字节数组方式复制
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("plusDay10\\src\\com\\haoxiujie\\workA3\\源.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("plusDay10\\src\\com\\haoxiujie\\workA3\\目标.png"));
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}

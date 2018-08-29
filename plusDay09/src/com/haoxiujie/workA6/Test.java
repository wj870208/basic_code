package com.haoxiujie.workA6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    //利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
    //要求：
    //一次读写一个字节的方式
    public static void main(String[] args) {
        File src = new File("plusDay09\\src\\com\\haoxiujie\\workA6\\src\\02.jpg");
        File dest = new File("plusDay09\\src\\com\\haoxiujie\\workA6\\dest\\02.jpg");
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            int len;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

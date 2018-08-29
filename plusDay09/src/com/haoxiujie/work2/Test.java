package com.haoxiujie.work2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    //1.项目根目录下建立两个文件夹：src和dest
    //	2.找一张图片放入src文件夹中
    //	3.将图片复制到dest文件夹中
    public static void main(String[] args) {
        File srcFile = new File("plusDay09\\src\\com\\haoxiujie\\work2\\src\\01.jpg");
        File destFile = new File("plusDay09\\src\\com\\haoxiujie\\work2\\dest\\01.jpg");
        try (FileInputStream fis = new FileInputStream(srcFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {
            byte[] bytes = new byte[4096];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

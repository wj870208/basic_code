package com.haoxiujie.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\HAO\\Desktop\\MAYDAY五月天 [ 後來的我們 ] feat.aMEI Official Live Video.mp4");
        File f2 = new File("D:\\沙箱\\MAYDAY五月天 [ 後來的我們 ] feat.aMEI Official Live Video.mp4");
        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);
        byte[] bytes = new byte[4096];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();
    }
}

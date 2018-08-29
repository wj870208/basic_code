package com.haoxiujie.test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\HAO\\Desktop\\1.txt", false);
        fos.write("╭(╯^╰)╮".getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream("C:\\Users\\HAO\\Desktop\\1.txt");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len));
        }
        fis.close();
    }
}

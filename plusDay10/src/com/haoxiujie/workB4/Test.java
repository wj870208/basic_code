package com.haoxiujie.workB4;

import java.io.*;
import java.util.LinkedList;

public class Test {
    //项目根路径下有text.txt文件，内容如下：
    //	我爱黑马
    //	123456
    //利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
    //	123456
    //我爱黑马
    public static void main(String[] args) throws IOException {
        LinkedList<String> lls = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader("plusDay10\\src\\com\\haoxiujie\\workB4\\text.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            lls.addLast(s);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("plusDay10\\src\\com\\haoxiujie\\workB4\\text.txt"));
        while (lls.size() > 0) {
            bw.write(lls.removeLast());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

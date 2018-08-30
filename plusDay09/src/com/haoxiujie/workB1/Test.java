package com.haoxiujie.workB1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    //在D盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
    //定义一个方法统计test.txt文件中’a’字符出现的次数。
    //比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
    public static void main(String[] args) {
        File file = new File("plusDay09\\src\\com\\haoxiujie\\workB1\\test.txt");
        fileCountChar(file, 'a');
    }

    private static void fileCountChar(File file, char c) {
        try (FileReader fw = new FileReader(file)) {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            int len;
            while ((len = fw.read()) != -1) {
                if (('a' == (char) len)) {
                    count++;
                }
            }
            System.out.println(c + "出现了" + count + "次");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

package com.haoxiujie.workA8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test {
    //我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
    //请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
    //score.txt文件内容如下：
    //zhangsan = 90
    //lisi = 80
    //wangwu = 85
    public static void main(String[] args) {
        File file = new File("plusDay09\\src\\com\\haoxiujie\\workA8\\score.txt");
        Properties properties = new Properties();
        try (FileReader reader = new FileReader(file)) {
            properties.load(reader);
            if (properties.getProperty("lisi") != null) {
                properties.setProperty("lisi", "100");
                FileWriter wf = new FileWriter(file);
                properties.store(wf, "");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

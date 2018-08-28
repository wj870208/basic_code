package com.haoxiujie.workB1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    //键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中,每种类型的文件及个数,
    //	注意:用文件类型(后缀名,不包含.,"java","txt")作为key,用个数作为value,放入到map集合中,并按照如下格式打印map集合中的内容
    //		docx类型的文件有  1 个
    //		java类型的文件有  24 个
    //		txt类型的文件有  10 个
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个文件夹路径：");
        File file = new File(sc.next());
        HashMap<String, Integer> hm = new HashMap<>();
        hm = showAccept(hm, file);
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " 类型的文件有 " + entry.getValue() + " 个 ");
        }
    }

    private static HashMap<String, Integer> showAccept(HashMap<String, Integer> hm, File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {//目录
                showAccept(hm, f);
            } else {//文件
                String s = f.getName();
                if (s.lastIndexOf(".") == -1) {
                    s = "无扩展名";
                } else {
                    s = s.substring(s.lastIndexOf(".") + 1);
                }
                if (hm.containsKey(s)) {//有这个扩展名
                    int i = hm.get(s) + 1;
                    hm.put(s, i);
                } else {//没有这个扩展名
                    hm.put(s, 1);
                }
            }
        }
        return hm;
    }
}

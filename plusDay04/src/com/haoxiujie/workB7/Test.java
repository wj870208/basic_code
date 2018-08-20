package com.haoxiujie.workB7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    //1.统计每个单词出现的次数
    //	2.有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
    public static void main(String[] args) {
        String rootstr = "If you want to change your fate I think you must come to the dark horse to learn java";
        String[] str = rootstr.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : str) {
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                count++;
                map.put(s, count);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

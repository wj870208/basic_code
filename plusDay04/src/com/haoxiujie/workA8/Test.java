package com.haoxiujie.workA8;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    //八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
    // 例如：集合中有”abc”、”bcd”两个元素，
    // 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : list) {
            for (char c : s.toCharArray()) {
                //将c添加到map
                if (map.get(c) == null) {
                    map.put(c, 1);
                } else {
                    int count = map.get(c);
                    count++;
                    map.put(c, count);
                }
            }
        }
        //输出：
        System.out.println(map);
    }
}

package com.haoxiujie.workA5;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    //五、定义一个方法listTest(ArrayList<String> al, String s),
    //             要求使用contains()方法判断al集合里面是否包含s。
    public static void main(String[] args) {
        ArrayList<String> cls = new ArrayList<>();
        cls.add("祝");
        cls.add("大");
        cls.add("家");
        cls.add("七");
        cls.add("夕");
        cls.add("快");
        cls.add("乐");
        System.out.println(listTest(cls, "快"));
    }

    private static boolean listTest(ArrayList<String> al, String s) {
        return al.contains(s);
    }
}

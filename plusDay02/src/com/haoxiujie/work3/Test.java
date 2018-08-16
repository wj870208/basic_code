package com.haoxiujie.work3;

import java.util.ArrayList;

public class Test {
    //定义一个集合，存储一些元素。并使用增强for循环遍历输出
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("祝");
        als.add("大");
        als.add("家");
        als.add("七");
        als.add("夕");
        als.add("快");
        als.add("乐");

        for (String al : als) {
            System.out.println(al);
        }
    }
}

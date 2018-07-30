package com.haoxiujie.work4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        1.创建一个ArrayList集合，用于存储一些字符串："abc","def","def","ghi","def","hij","jkol"
//        2.遍历集合，统计集合中"def"字符串一共出现了多少个
//        3.将集合中的所有"def"字符串删除。打印删除后的集合元素
        ArrayList<String> arrs = new ArrayList<>();
        arrs.add("abc");
        arrs.add("def");
        arrs.add("def");
        arrs.add("ghi");
        arrs.add("def");
        arrs.add("hij");
        arrs.add("jkol");

        int sum = 0;
        for (int i = 0; i < arrs.size(); i++) {
            if( arrs.get(i).equals("def")){
                sum++;
                arrs.remove(i);
                i--;
            }
        }
        System.out.println("\"def\"字符串一共出现了"+sum+"个");
        for (int i = 0; i < arrs.size(); i++) {
            System.out.print(arrs.get(i)+"\t");
        }
    }
}

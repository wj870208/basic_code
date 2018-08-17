package com.haoxiujie.work2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    //1.定义一个ArrayList集合，存储以下数字：55 45 65 75 35 25 85
    //	2.使用集合工具类对其排序。
    //	3.使用增强for遍历集合元素。
    public static void main(String[] args) {
        ArrayList<Integer> als = new ArrayList<>();
        Collections.addAll(als, 55, 45, 65, 75, 35, 25, 85);
        Collections.sort(als);
        for (Integer al : als) {
            System.out.println(al);
        }
    }
}

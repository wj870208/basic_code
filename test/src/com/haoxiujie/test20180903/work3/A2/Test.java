package com.haoxiujie.test20180903.work3.A2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    //1.定义一个ArrayList集合，存储以下数字：55 45 65 75 35 25 85
    //	2.使用集合工具类对其排序。
    //	3.使用增强for遍历集合元素。
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>();
        Collections.addAll(all, 55, 45, 65, 75, 35, 25, 85);
        all.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer i : all) {
            System.out.print(i + " ");
        }

    }
}

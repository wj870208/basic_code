package com.haoxiujie.workA2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        字符串数组strs中包含字符串{"12","345","6789","1","123","4567"}，创建2个ArrayList集合，
//        遍历strs数组，并判断数组中每一个元素的长度，
//        将长度为偶数的元素和长度为奇数的元素分别存放在两个集合中，
//        最终将这两个集合在控制台打印输出：打印格式如下：
        String[] strs = {"12", "345", "6789", "1", "123", "4567" };
        ArrayList<String> list1 = new ArrayList<>();//长度为奇数
        ArrayList<String> list2 = new ArrayList<>();//长度为偶数
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() % 2 == 1) {
                list1.add(strs[i]);
            } else {
                list2.add(strs[i]);
            }
        }
        System.out.print("长度为奇数的集合：");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "\t");
        }
        System.out.println();
        System.out.print("长度为偶数的集合：");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + "\t");
        }
    }
}

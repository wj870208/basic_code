package com.haoxiujie.workB1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Test {
    //1.定义一个长度为10的int数组,并存入10个int类型的数据,其中有一些数据是重复的
    //	2.利用集合的知识对数组进行去重,产生新数组,不能改变数组中原来数字的大小顺序
    //	3.打印新数组中的内容
    public static void main(String[] args) {
        int[] arr = {5, 0, 3, 0, 1, 7, 1, 3, 3, 2};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
}

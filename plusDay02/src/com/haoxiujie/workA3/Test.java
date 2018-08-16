package com.haoxiujie.workA3;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    //三、定义一个方法，要求此方法把int数组转成存有相同元素的集合
    //          (集合里面的元素是Integer)，并返回。
    public static void main(String[] args) {
        int[] i = {5, 2, 0, 1, 3, 1, 4};
        System.out.println(arrayToList(i));
    }

    private static Collection<Integer> arrayToList(int[] i) {
        Collection<Integer> cl = new ArrayList<>();
        for (int i1 : i) {
            cl.add(i1);
        }
        return cl;
    }
}

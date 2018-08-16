package com.haoxiujie.workA10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    //十、产生10个1-100的随机数，
    //      并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
    public static void main(String[] args) {
        Random rd = new Random();
        int[] i = new int[10];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i1 = 0; i1 < i.length; i1++) {
            i[i1] = rd.nextInt(100 + 1);
            if (i[i1] >= 10) {
                al.add(i[i1]);
            }
        }
        System.out.println(al);
    }
}

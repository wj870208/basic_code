package com.haoxiujie.workA8;

import java.util.ArrayList;

public class Test {
    //八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
    //      要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
    public static void main(String[] args) {
        ArrayList<Integer> als = new ArrayList<>();
        als.add(1);
        als.add(0);
        als.add(0);
        als.add(8);
        als.add(6);
        System.out.println(listTest(als, 0));
    }

    private static int listTest(ArrayList<Integer> al, Integer s) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == s) {
                return i;
            }
        }
        return -1;
    }
}

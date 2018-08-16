package com.haoxiujie.workA12;

import java.util.Arrays;

public class Test {
    //十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
    public static void main(String[] args) {
        Integer[] a = {1, 0, 0, 8, 6};
        System.out.println(Arrays.toString(endToBegin(a)));
    }

    private static <E> E[] endToBegin(E[] e) {
        E temp;
        for (int begin = 0, end = e.length - 1; begin < end; begin++, end--) {
            temp = e[begin];
            e[begin] = e[end];
            e[end] = temp;
        }
        return e;
    }
}

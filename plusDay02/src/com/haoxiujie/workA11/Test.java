package com.haoxiujie.workA11;

import java.util.Arrays;

public class Test {
    //十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
    public static void main(String[] args) {
        String[] arr = {"我", "爱", "你"};
        arr = indexToIndex(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
    }

    private static <E> E[] indexToIndex(E[] e, int i1, int i2) {
        E temp;
        temp = e[i1];
        e[i1] = e[i2];
        e[i2] = temp;
        return e;
    }
}

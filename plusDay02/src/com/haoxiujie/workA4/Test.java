package com.haoxiujie.workA4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test {
    //四、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
    //          并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
    public static void main(String[] args) {
        Collection<Integer> cl = new ArrayList<>();
        cl.add(5);
        cl.add(2);
        cl.add(0);
        cl.add(1);
        cl.add(3);
        cl.add(1);
        cl.add(4);
        Object[] arr = listToarray(cl);
        System.out.println(Arrays.toString(arr));
    }

    private static <E> Object[] listToarray(Collection<E> cl) {
        return cl.toArray();
    }
}

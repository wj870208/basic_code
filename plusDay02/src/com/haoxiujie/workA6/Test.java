package com.haoxiujie.workA6;

import java.util.ArrayList;

public class Test {
    //六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        System.out.println(listTest(als));
    }

    private static boolean listTest(ArrayList<String> al) {
        return !al.isEmpty();
    }
}

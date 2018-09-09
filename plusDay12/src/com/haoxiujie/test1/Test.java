package com.haoxiujie.test1;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static Comparator<String> getcomp() {
        return (o1, o2) -> o1.length() - o2.length();
    }

    public static void main(String[] args) {
        String[] str1 = {"aaaaaaaaaa", "bbbbbbbbbbbbb", "c", "ddddd"};
        System.out.println(Arrays.toString(str1));
        Arrays.sort(str1, getcomp());
        System.out.println(Arrays.toString(str1));
    }
}

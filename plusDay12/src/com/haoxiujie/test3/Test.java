package com.haoxiujie.test3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
    public static ArrayList<String> pre(String[] str, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : str) {
            if (pre1.and(pre2).test(s)) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] str = {"蒋杰蒋杰,女", "古力娜扎,女", "古天乐,男", "蒋杰,女"};
        ArrayList<String> list = pre(str, (s) -> {
            return s.split(",")[0].length() == 4;
        }, (s) -> {
            return s.split(",")[1].equals("女");
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}

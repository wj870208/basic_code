package com.haoxiujie.test2;

import java.util.function.Consumer;

public class Con1 {
    public static void getCon1(String[] str, Consumer<String> con1, Consumer<String> con2) {
        for (String s : str) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] str = {"蒋杰,女", "张三,男", "李四,女"};
        getCon1(str, (s) -> {
            String[] split = s.split(",");
            System.out.print(split[0] + ": ");
        }, (s) -> {
            String[] split = s.split(",");
            System.out.println(split[1]);
        });
    }
}

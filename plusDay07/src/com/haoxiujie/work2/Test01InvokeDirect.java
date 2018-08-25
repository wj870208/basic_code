package com.haoxiujie.work2;

public class Test01InvokeDirect {
    public static void main(String[] args) {
        invokeDirect(() -> System.out.println("导演去拍电影啦~"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}

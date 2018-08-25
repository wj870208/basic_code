package com.haoxiujie.test2Lambda;

public class Test {
    public static void main(String[] args) {
        toGo(() -> System.out.println("公交车"));
    }

    public static void toGo(Go go) {
        go.dobus();
    }
}

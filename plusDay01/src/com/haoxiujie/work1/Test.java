package com.haoxiujie.work1;

public class Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    private static void test4() {
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.print((s1 == s2) + ", ");
        System.out.println(s3.equals(s2));
    }

    private static void test3() {
        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.print((s1 == s2) + ", ");
        System.out.println(s1.equals(s2));
    }

    private static void test2() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.print((s1 == s2) + ", ");
        System.out.println(s1.equals(s2));
    }

    private static void test1() {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.print((s1 == s2) + ", ");
        System.out.println(s1.equals(s2));
    }
}

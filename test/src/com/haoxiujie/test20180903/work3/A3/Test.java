package com.haoxiujie.test20180903.work3.A3;

import java.util.HashSet;
import java.util.Scanner;

public class Test {
    //1.键盘录入一个字符串，去掉其中重复字符
    //2.打印出不同的那些字符，必须保证顺序。
    //          例如输入：aaaabbbcccddd，打印结果为：abcd。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.nextLine();
        HashSet<Character> hsc = new HashSet<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            hsc.add(c);
        }
        for (Character c : hsc) {
            System.out.print(c);
        }
    }
}

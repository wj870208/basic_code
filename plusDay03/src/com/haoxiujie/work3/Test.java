package com.haoxiujie.work3;

import java.util.HashSet;
import java.util.Scanner;

public class Test {
    //1.键盘录入一个字符串，去掉其中重复字符
    //    2.打印出不同的那些字符，必须保证顺序。
    // 例如输入：aaaabbbcccddd，打印结果为：abcd。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> chars = new HashSet<>();
        String str = sc.nextLine();
        char[] strCharArray = str.toCharArray();
        for (char aChar : strCharArray) {
            chars.add(aChar);
        }
        for (Character aChar : chars) {
            System.out.print(aChar);
        }
    }
}

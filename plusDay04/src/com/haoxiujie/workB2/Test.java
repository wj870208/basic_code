package com.haoxiujie.workB2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test {
    //    键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        System.out.println(set);
    }
}

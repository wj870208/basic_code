package com.haoxiujie.workA3;

import java.util.Scanner;

public class Main {
    //模拟注册用户，按照以下要求实现相关功能：
    //a. 提示用户在控制台输入手机号码，并接收。
    //b. 判断用户输入的是否都是手机号码(11位纯数字), 如果不是手机号码,则提示用户“注册用户失败”。
    //c. 将手机号的后四位获取出来输出到控制台上。
    public static void main(String[] args) {
        System.out.print("请输入手机号码：");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char [] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]<'0'||chars[i]>'9'){
                System.out.println("注册用户失败");
                return;
            }
        }
        System.out.println(num.substring(7,11));
    }
}

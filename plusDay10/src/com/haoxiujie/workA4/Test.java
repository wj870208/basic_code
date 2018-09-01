package com.haoxiujie.workA4;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
    //	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，
    //      并存入data.txt中，要求一个验证码占一行；
    //	2. 键盘录入一个需要被校验的验证码，
    //      如果输入的验证码在data.txt中存在：在控制台提示验证成功，
    //       如果不存在控制台提示验证失败
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("plusDay10\\src\\com\\haoxiujie\\workA4\\data.txt"));
        HashSet<String> als = new HashSet<>();
        String s;
        while ((s = br.readLine()) != null) {
            als.add(s);
        }
        br.close();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入校验码：");
        if (als.contains(sc.next())) {
            System.out.println("验证成功！");
        } else {
            System.out.println("验证失败！");
        }
    }
}

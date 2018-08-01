package com.haoxiujie.workB1;

import java.util.Scanner;

public class Main {
    //1.键盘录入一个源字符串由字符串变量scrStr接收
    //	2.键盘录入一个要删除的字符串由字符串变量delStr接收
    //	3.要求
    //		删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），
    // 要求打印删除后的结果以及删除了几个delStr字符串
    //	4.代码运行打印格式:
    //		请输入源字符串:java woaijava,i like jajavava i enjoy java
    //		请输入要删除的字符串:java
    //		控制台输出结果:源字符串中总共包含:5 个 java 删除java后的字符串为: woai,i like  i enjoy
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入源字符串：");
        String scrStr = sc.nextLine();
        System.out.print("请输入要删除的字符串：");
        String delStr = sc.nextLine();
        int count = 0;
        while (scrStr.indexOf(delStr)!=-1){//如果有要删除的
            count++;
            int begin = scrStr.indexOf(delStr);
            scrStr = scrStr.substring(0,begin)+scrStr.substring(begin+delStr.length());
        }
        System.out.println("源字符串中总共包含:"+count+"个 java ,   删除java后的字符串为:"+scrStr);
    }
}

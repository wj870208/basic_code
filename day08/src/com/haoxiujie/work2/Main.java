package com.haoxiujie.work2;


import java.util.Scanner;

public class Main {
    //1.键盘录入一个大字符串,再录入一个小字符串
    //	2.统计小字符串在大字符串中出现的次数
    //	3.代码运行打印格式:
    //		请输入大字符串:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
    //		请输入小字符串:heima
    //
    //		控制台输出:共出现3次
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个大字符串：");
        String bigStr = sc.next();
        System.out.print("请输入一个小字符串：");
        String smallStr = sc.next();
        int count = smallOfBig(bigStr, smallStr);
        System.out.println("共出现：" + count + "次");
        System.out.println("共出现：" + sOB(bigStr, smallStr) + "次");//老师讲的方法
    }

    //老师讲的一个比较有趣的方法：
    private static int sOB(String bigStr, String smallStr) {
        String newStr = bigStr.replace(smallStr, "");//将要替换的内容替换为空字符串
        return (bigStr.length() - newStr.length()) / smallStr.length();//次数为 大字符串-新字符串 即差值，除以小字符串的长度
    }

    private static int smallOfBig(String bigStr, String smallStr) {
        int count = 0;
        for (int i = 0; i < bigStr.length(); ) {
            if (count == 0) {
                i = bigStr.indexOf(smallStr);
            } else {
                i = bigStr.indexOf(smallStr, i);
            }
            if (i == -1) {
                return count;
            } else {
                count++;
                i += smallStr.length();
            }
        }
        return count;
    }
}
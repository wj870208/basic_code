package com.haoxiujie.workB3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    //从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        BufferedWriter bw = new BufferedWriter(new FileWriter("plusDay10\\src\\com\\haoxiujie\\workB3\\d.txt"));
        bw.write(sc.nextLine());
        bw.flush();
        bw.close();
    }
}

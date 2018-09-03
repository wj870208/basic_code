package com.haoxiujie.test20180903.work9.A1;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    //	3.要求完成如下功能：
    //	  程序运行时：控制台提示用户输入注册的用户名和密码；
    //	   验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
    //	   是：控制台提示：用户名已存在
    //	   否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功
    public static void main(String[] args) throws IOException {
        File file = new File("test\\src\\com\\haoxiujie\\test20180903\\work9\\A1\\user.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<>();
        String s;
        while ((s = br.readLine()) != null) {
            String[] split = s.split(",");
            hm.put(split[0], split[1]);
        }
        System.out.print("请输入用户名：");
        String userName = sc.nextLine();
        if (hm.containsKey(userName)) {
            System.out.println("用户名已存在");
            return;
        }
        System.out.print("请输入密码：");
        String userKey = sc.nextLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter("test\\src\\com\\haoxiujie\\test20180903\\work9\\A1\\user.txt", true));
        bw.newLine();
        bw.write(userName + "," + userKey);
        System.out.println("注册成功");
        bw.close();
    }
}

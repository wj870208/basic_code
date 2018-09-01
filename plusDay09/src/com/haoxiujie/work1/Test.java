package com.haoxiujie.work1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    //1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
    //	2. user.txt文件中初始存放的用户信息有如下：
    //		jack,123
    //		rose,123
    //		tom,123
    //	  程序运行时：控制台提示用户输入注册的用户名和密码；
    //	   验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
    //	   是：控制台提示：用户名已存在
    //	   否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("plusDay09\\src\\com\\haoxiujie\\work1\\user.txt");
        HashMap<String, String> users = fileToHashMap(file);
        //↑将用户名和密码转换成为了HashMap
        System.out.println("请输入要注册用户名：");
        String newName = sc.nextLine();
        if (users.containsKey(newName)) {
            System.out.println("用户名已存在");
            return;
        }
        System.out.println("请输入密码：");
        String newKey = sc.nextLine();

        StringBuilder sb = new StringBuilder("\r\n");
        sb.append(newName).append(",").append(newKey);
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(sb.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("注册成功！");
    }


    private static HashMap<String, String> fileToHashMap(File file) {
        HashMap<String, String> hm = new HashMap<>();
        //新建字符串读字符串
        StringBuilder userString = new StringBuilder();
        char[] chars = new char[1024];
        int len;
        try (FileReader reader = new FileReader(file)) {
            while ((len = reader.read(chars)) != -1) {
                userString.append(new String(chars, 0, len));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        String[] split = userString.toString().split("\r\n");
        for (String s : split) {
            String[] user = s.split(",");
            hm.put(user[0], user[1]);
        }
        return hm;
    }
}
package com.haoxiujie.workA7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    //请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
    //      可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入，以“886”行结尾");
        File file = new File("plusDay09\\src\\com\\haoxiujie\\workA7\\Info.txt");
        try (FileWriter fw = new FileWriter(file)) {
            String s = new String();
            while (!(s = sc.nextLine()).equals("886")) {
                fw.write(s + "\r\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

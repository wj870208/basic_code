package com.haoxiujie.workB2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Test {
    //从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
    //将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
    //当用户输入end时停止输入。
    public static void main(String[] args) {
        System.out.println("请输入学生的信息，以end结束");
        File file = new File("plusDay09\\src\\com\\haoxiujie\\workB2\\stu.properties");
        Scanner sc = new Scanner(System.in);
        Properties properties = new Properties();
        String iD, name;
        try (FileWriter fw = new FileWriter(file)) {
            while (true) {
                System.out.print("请输入学号：");
                if ((iD = sc.nextLine()).equals("end")) {
                    break;
                }
                System.out.print("请输入学号为" + iD + "的学生姓名：");
                name = sc.nextLine();
                properties.setProperty(iD, name);
            }
            properties.store(fw, "Student");
            fw.flush();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
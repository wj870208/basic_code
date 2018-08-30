package com.haoxiujie.workB3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    //从控制台接收3名学员的信息，每条信息存储到一个Student对象中，
    // 将多个Student对象存储到一个集合中。
    // 输入完毕后，将所有学员信息存储到文件Student.txt中。
    // 每名学员信息存储一行，多个属性值中间用逗号隔开。
    public static void main(String[] args) {
        System.out.println("本程序将接收3名学员的信息");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> als = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入学号：");
            int iD = sc.nextInt();
            System.out.print("请输入学号为" + iD + "的学生姓名：");
            String name = sc.next();
            als.add(new Student(iD, name));
        }
        File file = new File("plusDay09\\src\\com\\haoxiujie\\workB3\\student.txt");
        try (FileWriter fw = new FileWriter(file)) {
            for (Student student : als) {
                fw.write(student.toString());
                fw.flush();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

package com.haoxiujie.workB2;

import com.haoxiujie.workB1.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
    //将上一题保存到stu.txt文件中的学生对象读取出来。
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("plusDay10\\src\\com\\haoxiujie\\workB2\\stu.txt"));
        Object o = ois.readObject();
        Student stu = (Student) o;
        System.out.println(stu);
    }
}

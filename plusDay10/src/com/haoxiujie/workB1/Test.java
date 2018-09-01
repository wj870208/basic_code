package com.haoxiujie.workB1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    //定义一个学生类，包含姓名，年龄，性别等成员变量，
    //      提供setters和getters方法以及构造方法。
    //      在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。
    //      然后将该对象保存到当前项目根目录下的stu.txt文件中。
    public static void main(String[] args) throws IOException {
        Student student = new Student("张三", 18, "男");
        File file = new File("plusDay10\\src\\com\\haoxiujie\\workB1\\stu.txt");
        file.createNewFile();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(student);
        oos.close();
    }
}

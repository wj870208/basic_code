package com.haoxiujie.work3;

import javax.management.remote.SubjectDelegationPermission;
import java.io.*;
import java.util.ArrayList;

public class Test {
    //1.定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,生成空参有参构造,set和get方法,toString方法
    //	2.创建4个学生对象,将4个学生对象存入到ArrayList集合中
    //	3.将存有4个学生对象的ArrayList集合对象写入到D:\\StudentInfo.txt文件中
    //	4.读取D:\\StudentInfo.txt文件中的ArrayList对象并遍历打印
    //	5.要求使用序列化流来实现
    public static void main(String[] args) {
        ArrayList<Student> als = new ArrayList<>();
        als.add(new Student("张三", "男", 18));
        als.add(new Student("李四", "女", 17));
        als.add(new Student("王五", "女", 19));
        als.add(new Student("赵六", "男", 15));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("plusDay10\\src\\com\\haoxiujie\\work3\\StudentInfo.txt"))) {
            oos.writeObject(als);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //	4.读取D:\\StudentInfo.txt文件中的ArrayList对象并遍历打印
        ArrayList<Student> newals = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("plusDay10\\src\\com\\haoxiujie\\work3\\StudentInfo.txt"))) {
            Object o = ois.readObject();
            newals = (ArrayList<Student>) o;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Student s : newals) {
            System.out.println(s);
        }
    }
}

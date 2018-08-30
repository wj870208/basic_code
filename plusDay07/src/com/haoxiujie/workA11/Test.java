package com.haoxiujie.workA11;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    //对Java基础班学生的考试成绩进行排序
    //1.	定义一个学生类，有两个属性。姓名，考试成绩
    //2.	在测试类中定义一个学生数组，存储学生信息。
    //3.	使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("张一", 10);
        students[1] = new Student("张二", 20);
        students[2] = new Student("张三", 30);
        students[3] = new Student("张四", 40);
        students[4] = new Student("张五", 50);
        Arrays.sort(students, (o2, o1) -> (int) (o1.getScore() - o2.getScore()));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

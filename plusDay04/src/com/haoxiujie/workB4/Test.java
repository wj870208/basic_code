package com.haoxiujie.workB4;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    //	1.创建10个学生对象(其中有两个学员信息完全相同)存入集合中
    //	2.去除重复的学员并遍历打印剩余学员信息(分别利用普通for循环、增强for循环、迭代器遍历)
    //	3.打印最高分的学员信息
    //	4.打印平均分
    //	5.打印不及格的学员信息及数量
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("小1", 1, 10));
        list.add(new Student("小1", 1, 10));
        list.add(new Student("小2", 2, 20));
        list.add(new Student("小3", 3, 30));
        list.add(new Student("小4", 4, 40));
        list.add(new Student("小5", 5, 50));
        list.add(new Student("小6", 6, 60));
        list.add(new Student("小7", 7, 70));
        list.add(new Student("小8", 8, 80));
        list.add(new Student("小9", 9, 90));
        //	2.去除重复的学员并遍历打印剩余学员信息(分别利用普通for循环、增强for循环、迭代器遍历)
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }

        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("--------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------");
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //	3.打印最高分的学员信息
        System.out.println("--------打印最高分的学员信息--------");
        int maxs = 0;
        for (Student student : list) {
            if (student.getScore() > maxs) {
                maxs = student.getScore();
            }
        }
        for (Student student : list) {
            if (student.getScore() == maxs) {
                System.out.println(student);
            }
        }
        //	4.打印平均分
        System.out.println("--------打印平均分--------");
        int pjs = 0;
        for (Student student : list) {
            pjs += student.getScore();
        }
        pjs = pjs / list.size();
        System.out.println("平均分是: " + pjs + "分");
        //	5.打印不及格的学员信息及数量
        System.out.println("--------打印不及格的学员信息及数量--------");
        int count = 0;
        for (Student student : list) {
            if (student.getScore() < 60) {
                System.out.println(student);
                count++;
            }
        }
        System.out.println("不及格的学员数量为: " + count);
    }
}

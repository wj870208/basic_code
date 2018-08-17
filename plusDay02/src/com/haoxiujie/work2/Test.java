package com.haoxiujie.work2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
    创建三个学生对象存入ArrayList集合中。
	A：使用迭代器遍历集合。
	B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> als = new ArrayList<>();
        als.add(new Student("小明", 8, "男"));
        als.add(new Student("小花", 6, "女"));
        als.add(new Student("小美", 10, "女"));

        Iterator<Student> studentIterator = als.iterator();

        int maxage = 0;
        while (studentIterator.hasNext()) {
            int thisage = studentIterator.next().getAge();
            if (thisage > maxage) {
                maxage = thisage;
            }
        }

        for (Student al : als) {
            if (al.getAge() == maxage) {
                al.setName("小猪佩奇");
            }
        }
//        for (int i = 0; i < als.size(); i++) {
////            if (als.get(i).getAge() == maxage) {
//                als.get(i).setName("小猪佩奇");
//            }
//        }
        System.out.println(als);
    }
}

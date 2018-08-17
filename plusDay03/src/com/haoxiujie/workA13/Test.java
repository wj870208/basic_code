package com.haoxiujie.workA13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    //十三、分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。
    public static void main(String[] args) {
        Student s1 = new Student("liusan", 20, 90.0F);
        Student s2 = new Student("lisi", 22, 90.0F);
        Student s3 = new Student("wangwu", 20, 99.0F);
        Student s4 = new Student("sunliu", 22, 100.0F);
        ArrayList<Student> als = new ArrayList<>();
        Collections.addAll(als, s1, s2, s3, s4);

        System.out.println("Comparable:");
        Collections.sort(als);
        System.out.println(als);

        System.out.println("============");
        System.out.println("Comparator");
        Collections.sort(als, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = 0;
                i = (int) (o2.getFs() - o1.getFs());
                if (i == 0) {
                    i = o1.getAge() - o2.getAge();
                }
                return i;
            }
        });
        System.out.println(als);
    }
}

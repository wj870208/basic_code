package com.haoxiujie.test2Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> ali = new ArrayList<>();
        ali.add(new Student("张三", 1001));
        ali.add(new Student("李四", 1002));
        ali.add(new Student("王五", 1003));
        Collections.sort(ali, (Student o1, Student o2) -> {
            return o2.getId() - o1.getId();
        });
        System.out.println(ali);
    }
}

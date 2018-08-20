package com.haoxiujie.workB10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test {
    //2.初始化数据将若干Student对象存入List集合
    //	3.以班级为单位,使用Map存储所有该班学生
    //	4.统计每个班级的总分和平均分
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张1", "1班", 10));
        list.add(new Student("张11", "1班", 11));
        list.add(new Student("张2", "2班", 20));
        list.add(new Student("张22", "2班", 22));
        HashMap<String, ArrayList<Student>> map = new HashMap<>();
        for (Student student : list) {
            if (map.get(student.getClass_number()) == null) {
                ArrayList<Student> students = new ArrayList<>();
                students.add(student);
                map.put(student.getClass_number(), students);
            } else {
                ArrayList<Student> students = map.get(student.getClass_number());
                students.add(student);
                map.put(student.getClass_number(), students);
            }
        }
        //	4.统计每个班级的总分和平均分
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.print(s + ": ");
            ArrayList<Student> stu = map.get(s);
            int zf = 0;
            for (Student student : stu) {
                zf += student.getScore();
            }
            System.out.println("总分: " + zf);
            System.out.println(" 平均分: " + (zf / stu.size()));
        }
    }
}

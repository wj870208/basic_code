package com.haoxiujie.workB5;

import com.haoxiujie.workB4.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    //1.定义一个map集合,key为String类型的姓名,value为String类型地址,存入数据多条数据(假设不存在重名的情况),并用多种方式遍历
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("张一", "A城市");
        map1.put("张二", "B城市");
        map1.put("张三", "C城市");
        Set<String> set1 = map1.keySet();
        for (String s1 : set1) {
            System.out.println(s1 + ": " + map1.get(s1));
        }
        System.out.println("------------");
        Set<Map.Entry<String, String>> entries1 = map1.entrySet();
        for (Map.Entry<String, String> entry1 : entries1) {
            System.out.println(entry1.getKey() + ": " + entry1.getValue());
        }
        //	2.定义一个map集合,key为Student类型的对象,value为String类型的地址,存入数据多条数据(需要加入对象的唯一性判断)
        //		(1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)、成绩(int score)
        //		(2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
        //		(3)利用四种方式遍历Map集合中的内容，格式：key::value
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("张1", 1, 10), "1号公路");
        map.put(new Student("张2", 2, 20), "2号公路");
        map.put(new Student("张3", 3, 30), "3号公路");
        Set<Student> set = map.keySet();
        for (Student s : set) {
            System.out.println(s + ": " + map.get(s));
        }
        System.out.println("------------");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

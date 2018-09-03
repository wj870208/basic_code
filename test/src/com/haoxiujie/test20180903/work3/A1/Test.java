package com.haoxiujie.test20180903.work3.A1;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    //1.定义一个Person类
    //		成员变量：name   age
    //		构造方法、get和set、toSring
    //	2.创建三个Person对象
    //		Person("张三",23);
    //		Person("李四",24);
    //		Person("张三",23);
    //	3.将这三个对象存储到Set集合中。(同姓名同年龄的为重复值、不存储)
    //	4.使用迭代器遍历集合
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三", 23));
        hs.add(new Person("李四", 24));
        hs.add(new Person("张三", 23));
        Iterator<Person> it = hs.iterator();
        while (it.hasNext()) {
            Person next = it.next();
            System.out.println(next);
        }
    }
}

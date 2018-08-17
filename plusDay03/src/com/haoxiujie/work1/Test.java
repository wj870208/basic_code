package com.haoxiujie.work1;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();
        persons.add(new Person("张三", 23));
        persons.add(new Person("李四", 24));
        persons.add(new Person("张三", 23));
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

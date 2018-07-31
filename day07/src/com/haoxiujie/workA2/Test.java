package com.haoxiujie.workA2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        2. 创建一个ArrayList集合对象list，集合内元素类型为User，实例化3个User对象，
//        3个对象的属性分别为：”张三” 20， ”李四” 30， ”王五” 40，将3个对象添加到list集合中，
//        并使用for循环遍历集合，将集合中age属性大于30的人的姓名在控制台打印出来。
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("张三", 20));
        list.add(new User("李四", 30));
        list.add(new User("王五", 40));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > 30) {
                System.out.print(list.get(i).getName() + "\t");
            }
        }
    }
}

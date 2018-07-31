package com.haoxiujie.workA5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        2. 定义类：Test,类中定义main()方法，依次完成以下要求:
//        2.1 实例化3个Stu对象，3个对象的属性分别为：1001, 55.0、1002, 66.6、1003, 77.0
//        2.2 创建一个ArrayList集合，分别将上面的3个Stu对象添加到集合中
//        2.3 遍历集合，删除集合中分数不及格的元素，并打印集合中剩余元素的学号和成绩
        ArrayList<Student> als = new ArrayList<>();
        als.add(new Student(1001, 55.0));
        als.add(new Student(1002, 66.6));
        als.add(new Student(1003, 77.0));
        for (int i = 0; i < als.size(); i++) {
            if (als.get(i).getScore() < 60) {
                als.remove(i);
                i--;
            }
        }
        for (int i = 0; i < als.size(); i++) {
            System.out.println("学号：" + als.get(i).getNum() + ", 成绩：" + als.get(i).getScore());
        }
    }
}

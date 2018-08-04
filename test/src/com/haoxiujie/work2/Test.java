package com.haoxiujie.work2;

public class Test {
    public static void main(String[] args) {
        //   创建Person对象，调用sleep方法
        //   创建Student 对象，先调用sleep方法，再调用playGame方法，最后调用study方法
        Person person = new Person("小明", 2);
        Student student = new Student("小美", 3);

        person.sleep();
        student.sleep();
        student.playGame();
        student.study(student);
    }
}

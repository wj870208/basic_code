package com.haoxiujie.work2;

public class Person {
    //1)成员变量：姓名 name (String类型)， 年龄  age  (int类型);要求所有字段用private 修饰
    //  	2)构造方法:空参、满参构造方法；
    //  	3)成员方法：public void sleep(),无参无返回值，方法内输出“休息是人的本能”
    private String name;
    private int age;

    public void sleep() {
        System.out.println("休息是人的本能");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

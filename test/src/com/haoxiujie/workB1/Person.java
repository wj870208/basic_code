package com.haoxiujie.workB1;

public class Person {
    private String name;
    private int age;

    public Person() {
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void startExercise(Fitness fitness) {
        System.out.println(name + "开始锻炼");
        Plan p = new Plan("热身", "锻炼");
        fitness.info();
        fitness.fitnessPlan(p);
    }
}

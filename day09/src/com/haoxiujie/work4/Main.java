package com.haoxiujie.work4;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(3, "狗");
        Cat cat = new Cat(2, "猫");
        Person person = new Person("阿信", 20);
        System.out.println(person.keepPet(dog, "狗粮"));
        System.out.println(person.keepPet(cat, "猫粮"));
    }
}

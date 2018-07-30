package com.haoxiujie.work4.catDog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("花色", "波斯猫");
        Dog dog = new Dog();
        dog.setColor("黑色");
        dog.setBreed("藏獒");
        Panda panda = new Panda("豆豆",false);

        System.out.print(cat.getColor() + "的" + cat.getBreed() + "正在");
        cat.eat();
        System.out.print(cat.getColor() + "的" + cat.getBreed() + "正在");
        cat.catchMouse();
        System.out.print(dog.getColor() + "的" + dog.getBreed() + "正在");
        dog.eat();
        System.out.print(dog.getColor() + "的" + dog.getBreed() + "正在");
        dog.lookHome();
        System.out.print(panda.isSex() + "的" + panda.getName() + "正在");
        panda.actingCute();
        System.out.println(panda);
        String str = panda.toString();
        System.out.println(str);
    }
}

package com.haoxiujie.work4.catDog;

/*
属性:
			毛的颜色color
			品种breed
		行为:
			吃饭eat()
			抓老鼠catchMouse()
 */
public class Cat {
    private String color;//颜色
    private String breed;//品种

    public void eat() {
        System.out.println("吃鱼.....");
    }

    public void catchMouse() {
        System.out.println("逮老鼠....");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public Cat() {
    }
}

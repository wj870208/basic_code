package com.haoxiujie.work4.catDog;

/*
属性:
			毛的颜色color
			品种breed
		行为:
			吃饭()
			看家lookHome()
 */
public class Dog {
    private String color;//颜色
    private String breed;//品种

    public void eat() {
        System.out.println("啃骨头.....");
    }

    public void lookHome() {
        System.out.println("看家.....");
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

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public Dog() {
    }
}

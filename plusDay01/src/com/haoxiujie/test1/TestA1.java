package com.haoxiujie.test1;

public class TestA1 {
    static int i= 1;
    public static void main(String args[]){
        System.out.println("love " + new TestA1());//love java
        TestA1 a = new TestA1();
        a.i++;
        System.out.println("me " + a.i);//me 2
    }
    public String toString(){
        System.out.print("I ");//I
        return "java ";
    }
}

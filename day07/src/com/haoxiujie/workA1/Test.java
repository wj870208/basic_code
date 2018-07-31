package com.haoxiujie.workA1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Java 从入门到精通", 23.99));
        list.add(new Book("Java 设计模式", 32.85));
        list.add(new Book("Java 虚拟机", 70.65));
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个价格：");
        double num1 = sc.nextDouble();
        getBook(list, num1);
    }

    public static void getBook(ArrayList<Book> list, double num1) {
        ArrayList<Book> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() > num1) {
                newList.add(list.get(i));
            }
        }
        for (int i = 0; i < newList.size(); i++) {
            System.out.println("书名：" + newList.get(i).getName() + ", 价格：" + newList.get(i).getPrice());
        }
    }
}

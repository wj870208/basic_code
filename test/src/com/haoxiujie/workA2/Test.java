package com.haoxiujie.workA2;


import java.util.ArrayList;

public class Test {
    //定义public static ArrayList<Product> filter(ArrayList<Product> list,double price) {...}方法:
    //        要求：遍历list集合，
    //        将list中价格大于参数price的元素存入到另一个ArrayList<Phone> 中并返回
    public static ArrayList<Product> fliter(ArrayList<Product> list, double price) {
        ArrayList<Product> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() > price) {
                newlist.add(list.get(i));
            }
        }
        return newlist;
    }

    public static void main(String[] args) {
//        a.根据以下内容创建并初始化3个Phone对象
//        {"液晶电视",2999,"新机皇"}
//        {"Iphone", 5888,"火爆新机"}
//        {"电冰箱",1998,"新机器"}
//        b.创建一个ArrayList<Product> list_product，
//        将上面的3个Phone对象添加到list_product中，
//        调用filter方法传入list_phone和2000，
//        根据返回的list集合输出所有元素信息
        Product p1 = new Product("液晶电视", 2999, "新机皇");
        Product p2 = new Product("IPhone", 5888, "火爆新机");
        Product p3 = new Product("电冰箱", 1998, "新机器");
        ArrayList<Product> list_product = new ArrayList<>();
        list_product.add(p1);
        list_product.add(p2);
        list_product.add(p3);
        list_product = fliter(list_product, 2000);
        for (int i = 0; i < list_product.size(); i++) {
            System.out.println("名称：" + list_product.get(i).getName() + ", 价格：" + list_product.get(i).getPrice() + ", 类型：" + list_product.get(i).getType());
        }
    }
}

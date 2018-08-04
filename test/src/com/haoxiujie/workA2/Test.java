package com.haoxiujie.workA2;

import java.util.ArrayList;

public class Test {
    // ①定义public static ArrayList<Product> filter(ArrayList<Product> list,double price) {...}方法
    //        要求：遍历list集合，
    //        将list中价格大于参数price的元素存入到另一个ArrayList<Phone> 中并返回
    public static ArrayList<Phone> filter(ArrayList<Product> list, double price) {
        ArrayList<Phone> alp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()>price){
                alp.add((Phone) list.get(i));
            }
        }
        return alp;
    }
}

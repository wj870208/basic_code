package com.haoxiujie.workA4;

import java.util.ArrayList;

public class Test {
    //2.1分别实例化三个Soldier对象，三个对象分别为："王Java" ,25,”打篮球”
    //          、"李PHP" ,35,”游泳”、"王UI" ,55,”踢足球”;
    //    2.2创建一个ArrayList集合，这个集合里面存储的是Prgrammer类型，
    //          分别将上面的三个Prgrammer对象添加到集合中
    //2.3遍历这个集合，在遍历的过程中，如果这个集合里面中有对象的年龄大于40，
    //          那么将集合中这个对象的爱好改成”散步”，
    //          然后调用这个对象的show方法展示这个对象所有的属性信息
    public static void main(String[] args) {
        Programmer p1 = new Programmer("王Java", 25, "打篮球");
        Programmer p2 = new Programmer("李PHP", 35, "游泳");
        Programmer p3 = new Programmer("王UI", 55, "踢足球");
        ArrayList<Programmer> alp = new ArrayList<>();
        alp.add(p1);
        alp.add(p2);
        alp.add(p3);
        for (int i = 0; i < alp.size(); i++) {
            if (alp.get(i).getAge() > 40) {
                alp.get(i).setLike("散步");
                alp.get(i).show();
            }
        }

    }
}

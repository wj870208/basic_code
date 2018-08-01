package com.haoxiujie.workA4;

import java.util.ArrayList;

public class Main {
    //根据要求完成以下功能：
    //a.定义ArrayList集合，存入如下字符串：
    //"ab1"，"123ad"， "dadfadf"，"dddaaa"， "我来啦" ，"你别跑啊"
    //b.遍历集合,删除长度大于4的元素,在控制台打印输出删除后的集合中所有元素
    //输出结果格式如下：
    public static void main(String[] args) {
        ArrayList<String> arls = new ArrayList<>();
        arls.add("ab1");
        arls.add("123ad");
        arls.add("dadfadf");
        arls.add("dddaaa");
        arls.add("我来啦");
        arls.add("你别跑啊");
        for (int i = 0; i < arls.size(); i++) {
            if (arls.get(i).length() > 4) {
                arls.remove(i);
                i--;
            }
        }
        System.out.print("[");
        for (int i = 0; i < arls.size(); i++) {
            System.out.print(arls.get(i));
            if (i < arls.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}

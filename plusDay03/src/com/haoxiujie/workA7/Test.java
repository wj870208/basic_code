package com.haoxiujie.workA7;

import java.util.Collections;
import java.util.LinkedList;

public class Test {
    //七、向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        Collections.addAll(ll, "张三", "李四", "王五", "二丫", "钱六", "孙七");
        ll.set(ll.indexOf("二丫"), "王小丫");
        System.out.println(ll);
    }
}

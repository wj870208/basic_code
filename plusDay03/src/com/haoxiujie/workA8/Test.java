package com.haoxiujie.workA8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test {
    //八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
    // 使用迭代器和增强for循环遍历LinkedHashSet。
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet();
        Collections.addAll(lhs, "王昭君", "王昭君", "西施", "杨玉环", "貂蝉");
        Iterator<String> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("============");
        for (String lh : lhs) {
            System.out.println(lh);
        }
    }
}

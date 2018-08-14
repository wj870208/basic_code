package com.haoxiujie.workA8;

import java.util.Arrays;

public class Test {
    //八、现有一个字符数组{'i','t','c','a','s','a'}，
    // 请使用System类中的arraycopy()方法在控制台输出“itcast”。
    // （提示：将[1]号数组元素复制到最后位置并覆盖原有元素。）
    public static void main(String[] args) {
        char[] ch = {'i', 't', 'c', 'a', 's', 'a' };
        System.arraycopy(ch, 1, ch, 5, 1);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}

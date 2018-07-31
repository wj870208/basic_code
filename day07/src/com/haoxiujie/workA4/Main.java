package com.haoxiujie.workA4;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*随机生成8个1-20的数字，存放到合适的集合里面（包括1和20）
        计算出这些随机数的平均值并且输出
                将小于平均值的数字从集合中删除
        使用两种方式将集合中的元素输出到控制台*/
        Random rd = new Random();
        ArrayList<Integer> ali = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            ali.add(rd.nextInt(20) + 1);
        }
        int sum = 0;
        for (int i = 0; i < ali.size(); i++) {
            sum += ali.get(i);
        }
        int pjz = sum / ali.size();
        System.out.println("平均值为：" + pjz);
        for (int i = 0; i < ali.size(); i++) {
            if (ali.get(i) < pjz) {
                ali.remove(i);
                i--;
            }
        }
        System.out.print("[");
        for (int i = 0; i < ali.size(); i++) {
            System.out.print(ali.get(i));
            if (i != ali.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

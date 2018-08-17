package com.haoxiujie.workA10;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Test {
    //十、已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位
    // String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
    //将该数组里面的所有qq号都存放在LinkedList中，
    // 将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();
        Collections.addAll(ll, "12345", "67891", "12347809933", "98765432102", "67891", "12347809933");

        for (int i = 0; i < ll.size(); i++) {
            for (int j = ll.indexOf(ll.get(i)) + 1; j < ll.size(); j++) {
                if (ll.get(j).equals(ll.get(i))) {
                    ll.remove(j);
                    j--;
                }
            }
        }
        System.out.println(ll);
    }
}

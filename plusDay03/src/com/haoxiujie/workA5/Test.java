package com.haoxiujie.workA5;

import java.util.LinkedList;

public class Test {
    //五、根据要求练习LinkedList方法：
    //（1）基本方法：add, set, get, remove, clear, size等方法；
    //（2）特有方法：addFirst, addLast, getFirst, getLast,
    //              removeFirst,removeLast, push, pop, clear等方法。
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("今天是Day03");
        ll.add("今天学习了好多东西");
        ll.set(1, "今天学习了LinkedList方法");
        String s0 = ll.get(0);
        System.out.println(s0);
        ll.remove(0);
        System.out.println(ll);
        ll.clear();
        System.out.println(ll.size());


        ll.add("今天是Day03");
        ll.add("今天学习了好多东西");
        ll.add("今天学习了LinkedList方法");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}

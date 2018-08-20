package com.haoxiujie.workB8;

import java.util.HashMap;

public class Test {
    //(1)创建一个名为“有料饮料售货机”的售货机（VendingMachine），
    //			给“饮料列表属性赋值并添加附件列表中的元素”（直接添加到集合即可不用IO），
    //          设置机内剩余现金总额为100.0元。
    //		(2)调用售货机的购买饮料方法，向售货机投入10元的真币在“有料饮料售货机”成功购买一瓶脉动。
    public static void main(String[] args) {
        HashMap<String, Float> map = new HashMap<>();
        map.put("脉动", 4F);
        VendingMachine vm = new VendingMachine("有料饮料售货机", map, 100F);
        vm.buy(new Money(10, true), "脉动");
        vm.buy(new Money(10, false), "脉动");
        vm.buy(new Money(10, true), "可乐");
        vm.buy(new Money(1, true), "脉动");
    }
}

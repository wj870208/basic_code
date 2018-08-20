package com.haoxiujie.workA5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    //使用Map集合存储自定义数据类型Car做键，对应的价格做值。
    //          并使用keySet和entrySet两种方式遍历Map集合。
    public static void main(String[] args) {
        HashMap<Car, Integer> map = new HashMap<>();
        map.put(new Car("大众"), 20);
        map.put(new Car("奔驰"), 80);
        map.put(new Car("Jeep"), 120);

        Set<Car> carSet = map.keySet();
        for (Car car : carSet) {
            System.out.println(car + ": " + map.get(car));
        }

        Set<Map.Entry<Car, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Car, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

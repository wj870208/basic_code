package com.haoxiujie.work2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
        //               第二个数组内容为：[哈尔滨,杭州,南昌,广州,福州]，
        //			   将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
        //			   如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
        //			   使用两种方式遍历map集合
        String[] k = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省" };
        String[] v = {"哈尔滨", "杭州", "南昌", "广州", "福州" };
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < k.length; i++) {
            map.put(k[i], v[i]);
        }

        System.out.println("第一种方法：");
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string + ": " + map.get(string));
        }

        System.out.println("第二种方法：");
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

package com.haoxiujie.test20180903.work4.A2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    //有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
    //               第二个数组内容为：[哈尔滨,杭州,南昌,广州,福州]，
    //			   将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
    //			   如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
    //			   使用两种方式遍历map集合
    public static void main(String[] args) {
        String[] str1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省" };
        String[] str2 = {"哈尔滨", "杭州", "南昌", "广州", "福州" };
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < str1.length; i++) {
            hm.put(str1[i], str2[i]);
        }
        System.out.println("第一种：");
        Set<String> keySet = hm.keySet();
        for (String s : keySet) {
            System.out.println(s + "=" + hm.get(s));
        }
        System.out.println("第二种：");
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

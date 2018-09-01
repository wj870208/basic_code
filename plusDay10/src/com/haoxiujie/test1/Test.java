package com.haoxiujie.test1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        String tempstr;
        try (BufferedReader br = new BufferedReader(new FileReader("plusDay10\\src\\com\\haoxiujie\\test1\\test.txt"))) {
            while ((tempstr = br.readLine()) != null) {
                String[] split = tempstr.split("\\.");
                hm.put(Integer.valueOf(split[0]), split[1]);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("plusDay10\\src\\com\\haoxiujie\\test1\\test.txt"))) {
            for (Map.Entry<Integer, String> entry : entries) {
                bw.write(entry.getKey() + "." + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

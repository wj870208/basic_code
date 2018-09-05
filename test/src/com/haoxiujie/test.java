package com.haoxiujie;

import java.io.File;

public class test {
    //
    public static void main(String[] args) {
        File file = new File("C:\\Users\\HAO\\Desktop\\米果文化 - 马东携奇葩天团亲授“好好说话”");
        File[] files = file.listFiles();
        for (File f : files) {
            String name = f.getName();
            String[] split = name.split("\\.");
            try {
                int id = Integer.parseInt(split[1].substring(0, 3));
                id += 10;
                if (id < 100) {
                    split[0] = "0" + id;
                } else {
                    split[0] = id + "";
                }
                File newFile = new File(file, split[0] + "." + split[1] + ".m4a");
                f.renameTo(newFile);
            } catch (NumberFormatException e) {
                System.out.println(e + name);
            }
        }
    }
}

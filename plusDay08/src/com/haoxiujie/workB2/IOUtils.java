package com.haoxiujie.workB2;

import java.io.File;
import java.util.ArrayList;

public class IOUtils {
    //public static ArrayList<String> getAllFileNames2List(File srcDir,String fileType)
    //    //			参数File srcDir:源目录
    //    //			参数String fileType:文件类型(比如：.doc,.txt,.java)
    //    //			要求：将srcDir文件夹(包含子文件)所有扩展名为fileType的文件名称存入ArrayList<String>集合并返回
    //    //	4.测试IOUtils工具类中的方法
    public static ArrayList<String> getAllFileNames2List(File srcDir, String fileType) {
        ArrayList<String> strings = new ArrayList<>();
        getAllFileNames2List(srcDir, fileType, strings);
        return strings;
    }

    private static void getAllFileNames2List(File srcDir, String fileType, ArrayList<String> strings) {
        File[] files = srcDir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFileNames2List(f, fileType, strings);
            } else {
                if (f.getName().toLowerCase().endsWith(fileType)) {
                    strings.add(f.getName());
                }
            }
        }
    }
}

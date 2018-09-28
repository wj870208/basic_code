package com.haoxiujie.test1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String path = Test.class.getClassLoader().getResource("test.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");
        Elements name = document.getElementsByTag("name");
        for (Element element : name) {
            System.out.println(element.text());
        }
    }
}

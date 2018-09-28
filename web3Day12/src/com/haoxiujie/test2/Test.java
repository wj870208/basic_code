package com.haoxiujie.test2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String path = Test.class.getClassLoader().getResource("test.html").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");
        Elements elements = document.getElementsByAttributeValue("id", "content");
        String html = elements.html();
        String text = html.replace("<br>", "\n").replace("&nbsp;", "");

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("web3Day12\\src\\test.txt")));
        bw.write(text);
        bw.close();
    }
}

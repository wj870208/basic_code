package com.haoxiujie.com.haoxiujie.test3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("web3Day12\\src\\test.txt")));
        String path = Test.class.getClassLoader().getResource("603364.html").getPath();
        while (true) {
            path = appendText(path, bw);
            if (path == null) {
                break;
            }
        }
        bw.close();
    }

    public static String appendText(String path, BufferedWriter bw) throws IOException {
        Document document = Jsoup.parse(new File(path), "UTF-8");
        Elements elements = document.getElementsByAttributeValue("id", "content");
        String html = elements.html();
        String text = html.replace("<br>", "\n").replace("&nbsp;", "");
        bw.write(text);
        bw.flush();

        Elements elementsNext = document.getElementsByAttributeValue("id", "pager_next");
        String next = elementsNext.attr("href");
        next = Test.class.getClassLoader().getResource(next).getPath();
        return next;
    }
}

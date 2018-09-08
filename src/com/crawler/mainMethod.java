package com.crawler;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Administrator on 2018/9/5.
 */
public class mainMethod {
    //5ef5edbdc64c1bb49e9d6899
    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = Jsoup.connect("http://map.baidu.com/detail?qt=ninf&from=housezt&detail=house&uid=5ef5edbdc64c1bb49e9d6899").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements newsHeadlines = doc.select("#content img");
        for (Element headline : newsHeadlines) {
            String s = headline.attr("src");
            String s1 = headline.absUrl("href");
            System.out.println(s);
            System.out.println(s1);
        }
    }

    //直接从字符串中获取
    public static void getParByString() {
        String html = "<html><head><title> 这里是字符串内容</title></head" + ">" + "<body><p class='p1'> 这里是 jsoup 作用的相关演示</p></body></html>";
        Document doc = Jsoup.parse(html);
        Elements links = doc.select("p[class]");
        for (Element link : links) {
            String linkclass = link.className();
            String linkText = link.text();
            System.out.println(linkText);
            System.out.println(linkclass);
        }
    }

    //从本地文件中获取
    public static void getHrefByLocal() {
        File input = new File("C:\\Users\\Idea\\Desktop\\html\\Home.html");
        Document doc = null;
        try {
            doc = Jsoup.parse(input, "UTF-8"); //这里后面加了网址是为了解决后面绝对路径和相对路径的问题
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Elements links = doc.select("a[href]");
        for (Element link : links) {
            String linkHref = link.attr("href");
            String linkText = link.text();
            System.out.println(linkText + ":" + linkHref);
        }

    }

    //从网络上解析数据
    public static HashMap getHrefByNet(String url) {
        HashMap hm = new HashMap();
        String href = null;
        try {
            //这是get方式得到的
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            Elements links = doc.select("a[href]");

            for (Element link : links) {

                String linkHref = link.attr("abs:href");
                String linkText = link.text();
                //System.out.println(linkText+":"+linkHref);
                hm.put(linkText, linkHref);
                href = linkText;
            }
            //System.out.println("***************");
            //另外一种是post方式
            /*@SuppressWarnings("unused")
            Document doc_Post = Jsoup.connect(url)
                    .data("query","Java")
                    .userAgent("I am jsoup")
                    .cookie("auth","token")
                    .timeout(10000)
                    .post();
            Elements links_Post = doc.select("a[href]");
             for(Element link:links_Post){
                    String linkHref = link.attr("abs:href");
                    String linkText = link.text();
                    //System.out.println(linkText+":"+linkHref);

                    //map.put(linkText, linkHref);
                }*/

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            hm.put("加载失败", "error");
        }

        return hm;
    }

}

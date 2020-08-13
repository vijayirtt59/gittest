package com.Advanced.BFS.WebCrawler;



import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;

public class WebCrawler {

    private Queue<String> queue;
    private List<String> discoveredURLList;

    public WebCrawler(){
        this.queue = new LinkedList<>();
        this.discoveredURLList = new ArrayList<>();
    }

    public void discoverWeb(String root){

        this.queue.add(root);
        this.discoveredURLList.add(root);

        while (!queue.isEmpty()){
            String v = this.queue.remove();
            String rawHtml = readHtml(v);

            String regEx = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(rawHtml);

            while (matcher.find()){
                String actualURL = matcher.group();

                if(!discoveredURLList.contains(actualURL)){
                    discoveredURLList.add(actualURL);
                    queue.add(actualURL);
                    System.out.println("Website found: " + actualURL);
                }
            }
        }


    }

    public String readHtml(String link){
        String rawHtml = "";
        try {
            URL url = new URL(link);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine = "";

            while((inputLine = reader.readLine()) != null){
                rawHtml += inputLine;
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rawHtml;
    }
}

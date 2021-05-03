package com.company.practice10;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    private static int readOperations = 0;
    static String url1 = "https://www.google.com/";
    static String url2 = "https://ya.ru/";
    static String url3 = "https://www.youtube.com/";
    static ConcurrentLinkedQueue<String> urls = new ConcurrentLinkedQueue<String>();


    public static void main(String[] args) throws IOException {
        long start;


        System.out.println("Последовательная загрузка");
       // ConcurrentLinkedQueue<String> urls = new ConcurrentLinkedQueue<String>();
        start = System.currentTimeMillis();
        urls.add(getUrlsString(url1));
        urls.add(getUrlsString(url2));
        urls.add(getUrlsString(url3));
        System.out.println("Время на последовательную загрузку - " + (System.currentTimeMillis() - start));
        System.out.println("Байт потребовалось - " + readOperations);
        readOperations = 0;
        System.out.println("Параллельная загрузка");

        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    urls.add(getUrlsString(url1));
                    System.out.println("1 potok zapushen");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        URLsThread t1= new URLsThread();
        URLsThread t2= new URLsThread();
        URLsThread t3= new URLsThread();




        start = System.currentTimeMillis();
        t1.start();
      //  second.start();
        // third.start();
        System.out.println("Времени потребовалось - " + (System.currentTimeMillis() - start));
        System.out.println("Байт потребовалось - " + readOperations);

    }



    static Thread second = new Thread() {
        @Override
        public void run() {
            try {
                getUrlStringToQueue(url1,urls);
                ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

    static Thread third = new Thread() {
        @Override
        public void run() {
            try {
                getUrlStringToQueue(url1,urls);
                ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

    static public String getUrlsString(String url) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        byte[] buffer = new byte[1];
        try (InputStream inputStream = new URL(url).openStream()) {
            int read = inputStream.read(buffer);
            while (read != -1) {
                stringBuilder.append(new String(buffer));
                read = inputStream.read(buffer);
                readOperations++;
            }
        }
        return stringBuilder.toString();
    }

    static public void getUrlStringToQueue(String url, ConcurrentLinkedQueue queue) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        byte[] buffer = new byte[10];
        try (InputStream inputStream = new URL(url).openStream()) {
            int read = inputStream.read(buffer);
            while (read != -1) {
                stringBuilder.append(new String(buffer));
                read = inputStream.read(buffer);
                readOperations++;
            }
            queue.add(stringBuilder.toString());
        }
    }
}

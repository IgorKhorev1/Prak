package com.company.practice10;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    static final Object lock = new Object();

    private static int readOperations = 0;
    static String url1 = "https://www.google.com/";
    static String url2 = "https://ya.ru/";
    static String url3 = "https://www.youtube.com/";
    static ConcurrentLinkedQueue<String> urls = new ConcurrentLinkedQueue<String>();


    public static void main(String[] args) throws IOException, InterruptedException {
        long start;
        System.out.println("Последовательная загрузка");
        start = System.currentTimeMillis();
        urls.add(getUrlsString(url1));
        urls.add(getUrlsString(url2));
        urls.add(getUrlsString(url3));
        System.out.println("Времи потребовалось - " + (System.currentTimeMillis() - start));
        System.out.println("Байт потребовалось - " + readOperations);
        readOperations = 0;
        System.out.println("Параллельная загрузка");

        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    urls.add(getUrlsString(url1));
                    synchronized (lock) {
                        lock.notify();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    urls.add(getUrlsString(url2));
                    synchronized (lock) {
                        lock.notify();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread third = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    urls.add(getUrlsString(url3));
                    synchronized (lock) {
                        lock.notify();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        start = System.currentTimeMillis();
        first.start();
        synchronized (lock) {
            lock.wait();
        }
        second.start();
        synchronized (lock){
            lock.wait();
        }
        third.start();
        synchronized (lock){
            lock.wait();
        }
        System.out.println("Времени потребовалось - " + (System.currentTimeMillis() - start));
        System.out.println("Байт потребовалось - " + readOperations);

    }

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
}

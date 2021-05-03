package com.company.practice10;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLsThread extends Thread {
    volatile long readOperations = 0;
    public void run(String url) throws IOException {
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
    }
}

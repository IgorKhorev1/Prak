package com.company.practice9;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    long maxSize = 0;
    String maxFileName;

    long minSize = 0;
    String minFileName;


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        System.out.println(file.toAbsolutePath());
        if (file.toFile().length() > maxSize) {
            maxSize = file.toFile().length();
            maxFileName = file.toAbsolutePath().toString();
        }
        if (minSize != 0) {
            if (file.toFile().length() < minSize) {
                minSize = file.toFile().length();
                minFileName = file.toAbsolutePath().toString();
            }
        } else {
            minSize = file.toFile().length();
            minFileName = file.toAbsolutePath().toString();
        }
        return FileVisitResult.CONTINUE;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public String getMaxFileName() {
        return maxFileName;
    }

    public long getMinSize() {
        return minSize;
    }

    public String getMinFileName() {
        return minFileName;
    }
}

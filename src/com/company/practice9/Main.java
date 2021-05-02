package com.company.practice9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Path base = Paths.get("C:\\Users\\Igor Khorev\\Desktop\\SE2021_LESSON9");
        System.out.println(Files.createDirectories(base));
        int numberDir = new Random().nextInt(3) + 1;

        for (int i = 0; i < numberDir; i++) {
            base = Paths.get(base.toString() + "\\" + (i + 1));
            System.out.println(Files.createDirectories(base));
            for (int j = 0; j < new Random().nextInt(3) + 1; j++) {
                File file = new File(base.toString() + "\\" + "File_" + (j + 1));
                if (file.createNewFile()) {
                    System.out.println("File_" + (j + 1) + " create");
                }
                FileWriter fileWriter = new FileWriter(file);
                for (int nums = 0; nums < new Random().nextInt(190) + 10; nums++) {
                    Integer number = new Random().nextInt(8) + 1;
                    fileWriter.write(number.toString() + ",");
                }
                fileWriter.close();
            }
        }
        System.out.println("Полный путь ко всем файлам");
        MyFileVisitor myFileVisitor = new MyFileVisitor();
        Files.walkFileTree(Paths.get("C:\\Users\\Igor Khorev\\Desktop\\SE2021_LESSON9"), myFileVisitor);
        System.out.println("Максимальный и минимальный файлы");
        System.out.println("Максимальный файл - "+myFileVisitor.getMaxFileName());
        System.out.println("Размер - "+myFileVisitor.getMaxSize());

        try (FileInputStream fileInputStream = new FileInputStream(myFileVisitor.maxFileName);) {
            int b;
            do {
                b = fileInputStream.read();
                if (b != -1) {
                    System.out.print((char) b);
                }
            }
            while (b != -1);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Минимальный файл - "+myFileVisitor.getMinFileName());
        System.out.println("Размер - "+myFileVisitor.getMinSize());

        try {
            FileInputStream fileInputStream = new FileInputStream(myFileVisitor.minFileName);
            int b;
            for (int i = 0; i < 10; i++) {
                b = fileInputStream.read();
                System.out.print((char) b);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
File fileOnDelete = new File("C:\\Users\\Igor Khorev\\Desktop\\SE2021_LESSON9");

//        deleteDirectory(new File("C:\\Users\\Igor Khorev\\Desktop\\SE2021_LESSON9"));
    boolean result =     deleteDirectory(fileOnDelete);
        System.out.println(result);    }


    /*public static void deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                File f = new File(dir, children[i]);
                deleteDirectory(f);
            }
            dir.delete();
        } else dir.delete();
    }*/
     static boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }

}

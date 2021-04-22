package com.company.Practice6.Task1;

import java.util.Random;

public class MainBicycle {
    public static void main(String[] args) {
        int maxBicycles = 10;

        MyArrayList<Bicycle> bicycleArrayList = new MyArrayList<>();

        for (int i = 0; i < maxBicycles; i++) {
            Bicycle bicycle = new Bicycle("Bicycle" + (i + 1), new Random().nextInt(45) + 5);
            bicycleArrayList.add(bicycle);
            System.out.println(bicycleArrayList.get(i).getModelName() + " " + bicycleArrayList.get(i).getMaxSpeed());
        }
        System.out.println();

        MyArrayList<Integer> numbersList = new MyArrayList<>();

        for (int i = 0; i < numbersList.maxSize; i++) {
            numbersList.add(new Random().nextInt(10));
            System.out.println(numbersList.get(i));
        }
        System.out.println();

        for (int i = 0; i < numbersList.pointer; i++) {
            if (numbersList.get(i) % 2 == 0) {
                numbersList.remove(numbersList.get(i));
            }
        }
        for (int i = 0; i < numbersList.pointer; i++) {
            System.out.println(numbersList.get(i));
        }


    }
}

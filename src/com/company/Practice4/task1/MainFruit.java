package com.company.Practice4.task1;

import java.util.Random;

public class MainFruit {
    public static void main(String[] args) {

        int fruitCount = 4;
        Fruit[] fruits = new Fruit[fruitCount];


        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = getRandomFruit();
            System.out.println(fruits[i].toString());
        }

    }

    public static Fruit getRandomFruit() {
        Fruit randFruit = null;
        switch (new Random().nextInt(3)) {
            case 0:
                randFruit = new Apple();
                break;
            case 1:
                randFruit = new Orange();
                break;
            case 2:
                randFruit = new Pineapple();
                break;
        }
        return randFruit;
    }
}

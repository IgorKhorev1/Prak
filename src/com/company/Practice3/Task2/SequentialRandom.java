package com.company.Practice3.Task2;

import java.util.Random;

public class SequentialRandom {
    static Random random = new Random();
    static int randNumberTemp = random.nextInt(100);
    private int randNumber;

    SequentialRandom() {
        randNumber = randNumberTemp++;
    }

    public int getRandNumber() {
        return randNumber;
    }

    public static void resetRandom() {
        randNumberTemp = random.nextInt(100);
    }
}

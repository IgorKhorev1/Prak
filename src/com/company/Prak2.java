package com.company;

import java.util.Random;

public class Prak2 {
    public static void main(String[] args) {

        int[] mass = new int[10];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i]= random.nextInt();
        }

        for (int j : mass) {
            System.out.print(j + " ");
        }

    }
}

package com.company;

import java.util.Random;

public class Prak2_2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5];
        int[] array2 = new int[array.length];
        int[] array3 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int j : array) {
            System.out.print(j + " ");
        }

        for (int i = 0, k = 0, m = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array2[k] = array[i];
                k++;
            } else {
                array3[m] = array[i];
                m++;
            }
        }
        System.out.println();

        for (int i : array2) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i : array3) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int sumAvg = 0;
        int countAvg = 0;

        for (int j : array2) {
            if (j != 0) {
                sumAvg += j;
                countAvg++;
            }
        }
        System.out.println(sumAvg/countAvg);

        sumAvg=0;
        countAvg=0;

        for (int j : array3) {
            if (j != 0) {
                sumAvg += j;
                countAvg++;
            }
        }
        System.out.println(sumAvg/countAvg);
    }
}

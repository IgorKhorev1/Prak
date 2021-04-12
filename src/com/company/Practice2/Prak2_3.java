package com.company.Practice2;

import java.util.Random;

public class Prak2_3 {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[7];
        Integer[] array2 = new Integer[7];
        Integer[] array3 = new Integer[7];

        Random random = new Random();


        int k = 0, n = 0;
        boolean arrFull = false;

        while (!arrFull) {
            int rand = random.nextInt(200) - 100;
            if (rand > 0 && k < array1.length) {
                array1[k] = rand;
                k++;
            } else if (rand < 0 && n < array2.length) {
                array2[n] = rand;
                n++;
            } else if (k == array1.length && n == array2.length) {
                arrFull = true;
            }
        }


        for (Integer integer : array1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (Integer integer : array2) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.print(array3[i]+" ");
        }


    }


}

package com.company;

import java.util.Arrays;
import java.util.Random;

public class Prak2_1 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int j : array) {
            System.out.print(j + " ");
        }

        int sum = 0;
        for (int i : array) {
            sum+=i;
        }
        System.out.println("Сумма - "+sum);

        int minElement = array[0];
        int indexMinElement=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]<minElement){
                minElement=array[i];
                indexMinElement=i;
            }
        }

        /*int min = Arrays.stream(array).min().getAsInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==min){
                indexMinElement=i;
                break;
            }
        } */

        System.out.println("Минимальный элемент - "+minElement+", индекс - "+indexMinElement);


    }
}

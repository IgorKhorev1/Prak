package com.company.Practice3.Task2;

public class Practice3 {
    public static void main(String[] args) {
        SequentialRandom num1 = new SequentialRandom();
        System.out.println(num1.getRandNumber());
        SequentialRandom num2 = new SequentialRandom();
        System.out.println(num2.getRandNumber());
        SequentialRandom num3 = new SequentialRandom();
        System.out.println(num3.getRandNumber());
        SequentialRandom num4 = new SequentialRandom();
        System.out.println(num4.getRandNumber());

        SequentialRandom.resetRandom();

        SequentialRandom num5 = new SequentialRandom();
        System.out.println(num5.getRandNumber());
        SequentialRandom num6 = new SequentialRandom();
        System.out.println(num6.getRandNumber());

    }
}

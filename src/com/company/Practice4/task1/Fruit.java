package com.company.Practice4.task1;

import java.util.Random;

public class Fruit {
    int weight;


    public Fruit(int weight) {
        this.weight = weight;
    }

    public Fruit() {
        weight = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "->" +
                "weight=" + weight;
    }
}

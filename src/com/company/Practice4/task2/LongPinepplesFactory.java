package com.company.Practice4.task2;

import com.company.Practice4.task1.Fruit;
import com.company.Practice4.task1.Pineapple;

import java.util.Random;

public class LongPinepplesFactory extends AbstractFabric{

    @Override
    public Fruit makeFruit() {
        Pineapple fruit = new Pineapple(6,new Random().nextInt(10)+11);
        return fruit;
    }
}

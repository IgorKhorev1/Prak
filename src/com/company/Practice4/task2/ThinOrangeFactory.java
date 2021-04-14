package com.company.Practice4.task2;

import com.company.Practice4.task1.Fruit;
import com.company.Practice4.task1.Orange;

import java.util.Random;

public class ThinOrangeFactory extends AbstractFabric{
    @Override
    public Fruit makeFruit() {
        Orange fruit = new Orange(22,new Random().nextInt(5)+1);
        return fruit;
    }
}

package com.company.Practice4.task2;

import com.company.Practice4.task1.Apple;
import com.company.Practice4.task1.Fruit;

public class RedApplesFactory extends AbstractFabric{

    @Override
    public Fruit makeFruit() {
        Apple fruit = new Apple(1,"Red");
        return fruit;
    }
}

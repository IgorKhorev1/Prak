package com.company.Practice4.task1;

import java.util.Random;

public class Apple extends Fruit {
    String[] colors = new String[]{"Red", "Green", "Yellow"};
    String color;

    public Apple(int weight, String color) {
        super(weight);
        this.color = color;
    }

    public Apple() {
        super();
        color = colors[new Random().nextInt(3)];
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString() + " color=" + color + " ";
    }


}

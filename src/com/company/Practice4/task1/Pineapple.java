package com.company.Practice4.task1;

import java.util.Random;

public class Pineapple extends Fruit {
    int tailHeight;

    public Pineapple(int weight, int tailHeight) {
        super(weight);
        if (tailHeight > 5 && tailHeight < 21) {
            this.tailHeight = tailHeight;
        } else {
            System.out.println("incorrectly tail height");
            this.tailHeight = -1;
        }
    }

    public Pineapple() {
        super();
        tailHeight = new Random().nextInt(16) + 5;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString() + " tail height=" + tailHeight;
    }
}

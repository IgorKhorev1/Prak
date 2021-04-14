package com.company.Practice4.task1;

import java.util.Random;

public class Orange extends Fruit {
    int peelThickness;

    public Orange(int weight, int peelThickness) {
        super(weight);
        if (peelThickness >= 1 && peelThickness < 21) {
            this.peelThickness = peelThickness;
        } else {
            System.out.println("incorrectly peel thickness");
            this.peelThickness = -1;
        }
    }

    public Orange() {
        super();
        peelThickness = new Random().nextInt(21);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString() + " peel thickness=" + peelThickness;
    }
}

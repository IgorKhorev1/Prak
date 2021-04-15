package com.company.Practice5.task1;

public class Circle extends Figure {

    int radius;

    public Circle(int radius) throws Exceptions {
        if (radius > 0 && radius <= 10) {
            this.radius = radius;
        } else {
            throw new Exceptions(radius + " incorrect radius");
        }
    }

    @Override
    public double getSquare() {
        return radius * Math.PI;
    }
}

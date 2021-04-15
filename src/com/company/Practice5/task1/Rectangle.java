package com.company.Practice5.task1;

public class Rectangle extends Figure {
    int width;
    int height;

    public Rectangle(int width, int height) throws Exceptions {
        if(width>0 && width<=20 && height>0 && height<=20) {
            this.width = width;
            this.height = height;
        }else{
            throw new Exceptions("incorrect width/height");
        }
    }

    @Override
    public double getSquare() {
        return width*height;
    }
}

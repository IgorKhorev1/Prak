package com.company.Practice5.task1;

public class MainFigure {
    public static void main(String[] args) {
        int countFigure = 5;
        Figure[] figures = new Figure[countFigure];
        try {
            figures[0] = new Circle(5);
            figures[1] = new Rectangle(1, 2);
            figures[2] = new Circle(1);
            figures[3] = new Rectangle(10, 11);
            figures[4] = new Circle(10);
        } catch (Exceptions exceptions) {
            exceptions.printStackTrace();
        }

        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName()+" square = "+figure.getSquare());
        }

    }
}

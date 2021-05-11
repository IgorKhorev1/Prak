package com.company.practice11.task2;

@FunctionalInterface
public interface Operation {
    double doOperation(double number1, double number2) throws ArithmeticException;
}


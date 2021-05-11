package com.company.practice11.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number1: ");
        double num1 = in.nextInt();
        System.out.print("Input a number2: ");
        double num2 = in.nextInt();


        calc.addOperation("sum", (a, b) -> a + b);
        System.out.println("sum: " + calc.calculate("sum", num1, num2));

        calc.addOperation("subtraction", (a, b) -> a - b);
        System.out.println("subtraction: " + calc.calculate("subtraction", num1, num2));

        calc.addOperation("multiplication", (a, b) -> a * b);
        System.out.println("multiplication: " + calc.calculate("multiplication", num1, num2));

        calc.addOperation("division", (a, b) -> a / b);
        System.out.println("division: " + calc.calculate("division", num1, num2));

        calc.addOperation("exponentiation", (a, b) -> Math.pow(a, b));
        System.out.println("exponentiation: " + calc.calculate("exponentiation", num1, num2));

        calc.addOperation("multiplication", (a, b) -> Math.pow(a, 1.0 / b));
        System.out.println("multiplication: " + calc.calculate("multiplication", num1, num2));


    }


    Map<String, Operation> operations = new HashMap<String, Operation>();

    public void addOperation(String operationName, Operation implementation) {
        operations.put(operationName, implementation);
    }

    public double calculate(String operationName, double number1, double number2) {
        return operations.get(operationName).doOperation(number1, number2);
    }

}

package com.company.practice11;

public class Main {
    public static void main(String[] args){
        Calc calc = new Calc();
        calc.addOperation("summ", (a,b) -> a+b);
        System.out.println(calc.calculate("summ", 3.0,6.0));
        calc.addOperation("subtraction", (a,b) -> a-b);
        System.out.println(calc.calculate("subtraction", 9.0,6.0));

    }
}

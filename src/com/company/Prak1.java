package com.company;

import java.util.Scanner;

public class Prak1 {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();


        if(num1>num2){
            System.out.println("Число "+num1+" больше "+num2);
        }
        else {
            System.out.println("Число "+num2+" больше "+num1);
        }

        System.out.println(num1+num2);
    }
}

package com.company;

import java.util.Scanner;

//Practice
public class Prak1 {

    //в main - только создание объектов, и вызов функций, можно выводить в консоль. Но вся логика и вычисления должна выноситься в функции
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        //Добавить запрос ввода
        num1 = scanner.nextInt();
        //Добавить запрос ввода
        num2 = scanner.nextInt();

        //в коде только английский!!!!!!!
        //а если переменные равны?
        if(num1>num2){
            System.out.println("Число "+num1+" больше "+num2);
        }
        else {
            System.out.println("Число "+num2+" больше "+num1);
        }

        //в выводе не производятся вычисления, лучше сделать отдельную переменную summ
        System.out.println(num1+num2);
    }
}

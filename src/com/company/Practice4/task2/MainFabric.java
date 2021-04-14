package com.company.Practice4.task2;

import com.company.Practice4.task1.Fruit;
import java.util.Random;

public class MainFabric {
    public static void main(String[] args) {
        int countFabrics = 10;
        AbstractFabric[] fabrics = new AbstractFabric[countFabrics];
        fabrics= getRandomFabricsArray(fabrics);

        int countFruits =20;
        Fruit[] fabricFruits = new Fruit[countFruits];

        for (int i = 0; i < fabricFruits.length; i++) {
            fabricFruits[i]=fabrics[i/2].makeFruit();
        }
        for (Fruit fabricFruit : fabricFruits) {
            System.out.println(fabricFruit.toString());
        }

    }


    public static AbstractFabric[] getRandomFabricsArray(AbstractFabric[] fabrics) {
        for (int i = 0; i < fabrics.length; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    fabrics[i] =new ThinOrangeFactory();
                    break;
                case 1:
                    fabrics[i] = new RedApplesFactory();
                    break;
                case 2:
                    fabrics[i] = new GreenApplesFactory();
                    break;
                case 3:
                    fabrics[i] = new LongPinepplesFactory();
                    break;
            }
        }
        return fabrics;
    }
}

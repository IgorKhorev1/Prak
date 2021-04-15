package com.company.Practice5.task1;

public abstract class  Figure {

    int x;
    int y;

    public abstract double getSquare();

    public Quarters getQuadrant(int x,int y){
        if(x>0 && y>0){
            return Quarters.I;
        } else if (x<0 && y>0){
            return Quarters.II;
        } else if(x<0 && y<0){
            return Quarters.III;
        } else if(x>0 && y<0){
            return Quarters.IV;
        }
        return null;
    }
}


enum Quarters {I,II,III,IV}

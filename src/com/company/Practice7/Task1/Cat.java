package com.company.Practice7.Task1;

public class Cat extends PetAnimal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void getFavoriteMeal() {
        super.getFavoriteMeal();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

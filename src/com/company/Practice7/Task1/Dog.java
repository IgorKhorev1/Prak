package com.company.Practice7.Task1;

public class Dog extends PetAnimal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void getFavoriteMeal() {
        super.getFavoriteMeal();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

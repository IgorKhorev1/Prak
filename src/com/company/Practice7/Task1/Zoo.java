package com.company.Practice7.Task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zoo {
    Set<WildAnimal> wildAnimalSet = new HashSet<>();
    Set<PetAnimal> petAnimalSet = new HashSet<>();

    public Zoo() {
       fillCollectionWithPetAnimals(petAnimalSet);
        fillCollectionWithWildAnimals(wildAnimalSet);
    }

    void fillCollectionWithPetAnimals(Set<PetAnimal> petAnimalSet) {
        for (int i = 0; i < new Random().nextInt(5); i++) {
            if (new Random().nextBoolean()) {
                petAnimalSet.add(new Cat("Cat #" + i));
            } else {
                petAnimalSet.add(new Dog("Dog #" + i));
            }
        }
    }

    void fillCollectionWithWildAnimals(Set<WildAnimal> wildAnimalSet){
        for (int i = 0; i < new Random().nextInt(7) + 3; i++) {
            if (new Random().nextBoolean()) {
                wildAnimalSet.add(new Wolf("Wolf #" + i));
            } else {
                wildAnimalSet.add(new Fox("Fox #" + i));
            }
        }
    }

    private void printAnimalsFromCollection(Set<? extends Animal> animalSet){
        System.out.println(animalSet.toString());
    }

    public void printAllAnimal(){
        printAnimalsFromCollection(petAnimalSet);
        printAnimalsFromCollection(wildAnimalSet);
    }

}

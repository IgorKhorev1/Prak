package com.company.Practice5.task2;

public class Main {
    public static void main(String[] args) {
        int countPerson = 10;

        Person[] randomPersons = new Person[countPerson];
        getRandomPersonsArray(randomPersons);
        for (int i = 0; i < randomPersons.length; i++) {
            System.out.println("Person №"+(i+1)+" has a favorite game - "+randomPersons[i].favoriteSeason.gameForSeason.game);
        }

    }

    public static Person[] getRandomPersonsArray(Person[] person) {
        String[] namesPerson = new String[]{"Ivan", "Nikita", "Dima", "Ilya", "Viktor"};
        Season[] seasons = new Season[]{Season.AUTUMN, Season.SPRING, Season.SUMMER, Season.WINTER};
        for (int i = 0; i < person.length; i++) {
            int randomIndexName = (int) (Math.random() * namesPerson.length);
            int randomIndexSeason = (int) (Math.random() * Season.values().length);
            person[i] = new Person(namesPerson[randomIndexName], seasons[randomIndexSeason]);
        }
        return person;
    }
}

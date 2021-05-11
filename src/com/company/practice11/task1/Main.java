package com.company.practice11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            Person person = new Person(("Person #" + new Random().nextInt(100)), i);
            personList.add(person);
        }

        System.out.println("Sorted by name\n");
        personList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        for (Person person : personList) {
            System.out.println(person.getName()+" "+person.getAge());
        }

        System.out.println("Sorted by age\n");
        personList.sort((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
        for (Person person : personList) {
            System.out.println(person.getName()+" "+person.getAge());
        }

    }

}

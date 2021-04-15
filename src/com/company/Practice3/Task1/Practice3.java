package com.company.Practice3.Task1;


public class Practice3 {
    public static void main(String[] args) {
        String[] firstNamesPerson = new String[]{"Ivan", "Nikita", "Dima", "Ilya", "Viktor"};
        String[] lastNamesPerson = new String[]{"Kazakov", "Kartoshkin", "Mironov", "Getmanchuk", "Kuzin", "Shabanov"};

        Person[] randomPerson = new Person[50];
        for (int i = 0; i < randomPerson.length; i++) {
            int randomIndexFirstName = (int) (Math.random() * firstNamesPerson.length);
            int randomIndexLastName = (int) (Math.random() * lastNamesPerson.length);
            randomPerson[i] = new Person(firstNamesPerson[randomIndexFirstName], lastNamesPerson[randomIndexLastName]);

            System.out.println(String.format("Person №%s - lastName - %s, firstName - %s", i, randomPerson[i].lastName, randomPerson[i].firstName));
        }
    }
}

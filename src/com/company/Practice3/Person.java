package com.company.Practice3;

public class Person {
    String firstName = new String();
    String lastName = new String();

    public Person (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return String.format("Person \nlastName - %s\nfirstName - %s",lastName,firstName);
    }
}

package com.company.Practice8;

public class Person {
    public String lastName;
    @JsonName("name")
    public String firstName;
    @JsonName("years")
    public int age;
    @JsonIgnore
    public String password;

    public Person(String firstName, String secondName, int age, String password) {
        this.lastName = secondName;
        this.firstName = firstName;
        this.age = age;
        this.password = password;
    }
}



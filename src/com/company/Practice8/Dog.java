package com.company.Practice8;

public class Dog {
    @JsonName("name")
    public String firstName;
    @JsonName("years")
    public int age;

    public Dog(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
}
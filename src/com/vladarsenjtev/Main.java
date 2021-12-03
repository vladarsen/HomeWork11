package com.vladarsenjtev;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = CreatesPerson.generatePersons();
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
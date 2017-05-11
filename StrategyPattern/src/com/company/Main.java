package com.company;

import interfaces.Person;
import modules.PersonImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Person> nameSet = new TreeSet<>();
        TreeSet<Person> ageSet = new TreeSet<>();

        int lines = Integer.valueOf(reader.readLine());

        for (int index = 0 ; index < lines ; index ++ ){
            String[] parametars = reader.readLine().split("\\s");

            String name = parametars[0];
            Integer age = Integer.valueOf(parametars[1]);

            nameSet.add(new PersonImpl(name,age));
            ageSet.add(new PersonImpl(name,age));

        }
        nameSet.forEach(System.out::println);
        ageSet.forEach(System.out::println);
    }
}

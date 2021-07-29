package com.sda.design_patterns.builder.ex1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person.PersonBuilder personBuilder = new Person.PersonBuilder(
                "2947592346",
                "Bale",
                "Christiana",
                new Date(),
                "female"
        )
                .setReligion("Ortodox")
                .setStudies("Bachelor");
        System.out.println(personBuilder.toString());
    }

}

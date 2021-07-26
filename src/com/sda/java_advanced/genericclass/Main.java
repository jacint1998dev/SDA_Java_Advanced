package com.sda.java_advanced.genericclass;
/*
* Create the Identifiable interface with the fallowing method:
- getId: String
Create the IdentifiableRepository class, which will be responsible for:
- adding objects
- searching for objects with the indicated id
- removing objects based on the provided id
Create 3 child classes for the Identifiable class:
- Car
- Person
- MobilePhone
Test the IdentifiableRepository in a main class. */

import com.sda.java_advanced.genericclass.model.Person;
import com.sda.java_advanced.genericclass.repository.IdentifiableRepository;
import com.sda.java_advanced.genericclass.repository.PersonRepository;



public class Main {
    public static void main(String[] args) {

        IdentifiableRepository<Person> personRepository = new IdentifiableRepository<>();
        Person person = new Person();
        person.setCNP("1980522200");
        person.setName("Jacint");
        personRepository.addItems(person);
        System.out.println(personRepository.getItemById("10264412154"));
        System.out.println(personRepository.getItemById("1980522200"));
        personRepository.removeItemById("1980522200");
        System.out.println(personRepository.getItemById("1980522200"));

        PersonRepository personRepository1 = new PersonRepository();
        Person person1 = new Person();
        person1.setName("KJ");
        person1.setCNP("1231111");
        personRepository1.addItems(person1);
        System.out.println(personRepository1.getPersonByName("KJ"));



    }
}

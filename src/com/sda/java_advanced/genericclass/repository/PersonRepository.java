package com.sda.java_advanced.genericclass.repository;

import com.sda.java_advanced.genericclass.model.Person;


public class PersonRepository extends IdentifiableRepository<Person>{

    public Person getPersonByName(String name){
        for(Person person:items){
            if (person.getName().equals(name)){
                return person;
            }
        }
        return null;

    }

}

package com.sda.conccurancy.exercise2.repository;

import com.sda.conccurancy.exercise2.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PersonRepository {
    private Map<Integer, Object> locks = new ConcurrentHashMap<>();
    private Map<Integer, Person> personsById = new HashMap<>();
    private Map<String, Integer> personsIdsByName = new HashMap<>();
    private Map<String, Integer> personsIdsByAddress = new HashMap<>();
    private Map<String, Integer> personsIdsByPhoneNumber = new HashMap<>();

    public void addPerson(Person person) {
        locks.putIfAbsent(person.getId(), new Object());
        synchronized (locks.get(person.getId())) {
            personsById.put(person.getId(), person);
            personsIdsByPhoneNumber.put(person.getPhoneNumber(), person.getId());
            personsIdsByName.put(person.getName(), person.getId());
            personsIdsByAddress.put(person.getAddress(), person.getId());
        }
    }

    public void deletePersonById(Integer id) {
        locks.putIfAbsent(id, new Object());
        synchronized (locks.get(id)) {
            Person person = personsById.get(id);
            if (person != null) {
                personsIdsByAddress.remove(person.getAddress());
                personsIdsByName.remove(person.getName());
                personsIdsByPhoneNumber.remove(person.getPhoneNumber());
                personsById.remove(id);
            }
        }
    }

    public Person searchPersonByName(String name) {
        Integer id = personsIdsByName.get(name);
        locks.putIfAbsent(id,new Object());
        if (id != null){
            synchronized (locks.get(id)){
                id = personsIdsByName.get(name);
                if (id != null) {
                    Person person = personsById.get(id);
                    return person;
                }else {
                    return null;
                }
            }
        }else {
            return null;
        }
    }

    public int getSize(){
        return personsById.size();
    }

}

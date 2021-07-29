package com.sda.design_patterns.behaviour.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "BCD");
        Iterator<String> iterator = list.iterator();


        //METHODS INCLUDED IN THE ITERATOR DESIGN PATTERN
        iterator.hasNext(); //returneaza boolean e corect sa apelezi prima data HasNext pt a face verificarea mai intai
        iterator.next();


        //OTHER METHOD
        iterator.remove();
        iterator.forEachRemaining(System.out ::println);
    }
}

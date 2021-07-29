package com.sda.denisbalaceanu.designpatterns.behaviour.iterator.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("ABC", "BCD");
        Iterator<String> iterator = list.iterator();

        // METHODS INCLUDED IN THE ITERATOR DESIGN PATTERN
        iterator.hasNext();
        iterator.next();

        while (iterator.hasNext())
        {
            iterator.next();
        }

        // OTHER METHODS
        iterator.remove();
        iterator.forEachRemaining(System.out::println);

        ListIterator<String> iterator1 = list.listIterator();
    }
}

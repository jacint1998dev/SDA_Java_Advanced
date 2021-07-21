package com.sda.streams;

import java.util.*;
import java.util.stream.Collectors;

/*1. Using streams, for a given lists:
- [„John", „Sarah", „Mark", „Tyla", „Ellisha", „Eamonn"]
- [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
- Sort the list.
- Print only those names, that start with „E" letter.
- Print values greater than 30 and lower than 200.
- Print names uppercase.
- Remove first and last letter, sort and print names.
- *Sort backwards by implementing reverse Comparator and using lambda expression.*/
public class Main2 {
    private static final List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
    private static final List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

    public static void main(String[] args) {

        List<String> namesSorted = names.stream().sorted().collect(Collectors.toList());
        namesSorted.forEach(name -> System.out.println(name));

        System.out.println("--------------------------");

        List<Integer> numbersSorted = numbers
                .stream()
                .sorted()
                .collect(Collectors.toList()
                );
        numbersSorted.forEach(number -> System.out.println(number));

        System.out.println("--------------------------");

        names.stream()
                .filter(name -> name.startsWith("E"))
                .forEach(name -> System.out.println(name)
                );

        System.out.println("-------------------------");

        numbers.stream()
                .filter(number -> number > 30)
                .filter(number -> number < 200)
                .forEach(number -> System.out.println(number)
                );

        System.out.println("--------------------------");

        names.stream()
                .map(name -> name.toUpperCase(Locale.ROOT))
                .forEach(name -> System.out.println(name)
                );

        System.out.println("--------------------------");

        names.stream()
                .sorted()
                .map(name -> name.substring(1,name.length()-1))
                .forEach(name -> System.out.println(name));

        System.out.println("--------------------------");

        numbers.stream()
                .sorted((number1,number2) ->Integer.compare(number2, number1))
                .forEach(number -> System.out.println(number)
                );
    }
}

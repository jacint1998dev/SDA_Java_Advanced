package com.sda.java_advanced_coding.exercises.ex1;
/**
 * 1.
 * Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to A
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "t", "h", "l", "x", "k", "j", "z");

        List<String> sortedStringList = sortList(stringList);

    }
        public static List<String> sortList (List<String> stringList) {
            stringList.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList())
                    .forEach(list -> System.out.println(list));

            return stringList;
        }
    }

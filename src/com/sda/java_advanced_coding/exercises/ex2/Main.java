package com.sda.java_advanced_coding.exercises.ex2;

import java.util.*;

/**
 * Create a method that takes a string list as a parameter, then returns that list sorted alphabetically from Z to A case-insensitive
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana","pen","Phone","mouse","Water","Table","banana");
        System.out.println(reverseSortListCaseInsensitive(list));
    }

    public static List<String> reverseSortListCaseInsensitive(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o2.compareToIgnoreCase(o1);
            }
        });
        return list;
    }
}

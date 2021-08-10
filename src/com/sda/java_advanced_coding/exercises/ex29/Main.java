package com.sda.java_advanced_coding.exercises.ex29;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10, 20, 30, 40);
        System.out.println(partOf(list, element -> element % 2 == 0));
        System.out.println(partOf(list, element -> element % 2 == 1));


    }

    public static <T> double partOf(List<T> list, Predicate<T> predicate) {
        long validElement = list.stream().filter(predicate).count();
        if (list.size() > 0) {
            double result = (double) validElement / list.size();
            return result * 100;
        } else {
            return 0;
        }
    }
}

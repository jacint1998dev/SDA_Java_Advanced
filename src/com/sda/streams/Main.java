package com.sda.streams;


import java.util.List;

import static java.util.List.*;

/*List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")
- Print All Courses individually
- Print Courses Containing the word "Spring"
- Print Courses Whose Name has at least 4 letters
- Print the number of characters in each course name*/
public class Main {
    public static void main(String[] args) {

        List<String> courses = List.of(
                "Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes"
        );
        courses.stream()
                .forEach(word -> System.out.println(word));
        System.out.println("=========================");

        courses.stream()
                .filter(word -> word.contains("Spring"))
                .forEach(word -> System.out.println(word));
        System.out.println("-------------------------");

        courses.stream()
                .filter(word -> word.length()>4)
                .forEach(word -> System.out.println(word));
        System.out.println("-------------------------");

        courses.stream()
                .forEach(word -> System.out.println(word.length()));
        System.out.println("-------------------------");

        courses.stream()
                .sorted((word1, word2) -> Integer.compare(word2.length(),word1.length()))
                .forEach(word -> System.out.println(word));
        System.out.println("-------------------------");

        courses.stream()
                .sorted((word1, word2) -> Integer.compare(word1.length(),word2.length()))
                .forEach(word -> System.out.println(word));
        System.out.println("--------------------------");

        courses.stream()
                .limit(5)
                .forEach(word -> System.out.println(word));
        System.out.println("--------------------------");
    }
}

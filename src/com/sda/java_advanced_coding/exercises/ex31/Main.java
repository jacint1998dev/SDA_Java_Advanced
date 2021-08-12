package com.sda.java_advanced_coding.exercises.ex31;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a program that will count the occurrences of each word in a text file and then save the results in the form
 * of a table in a new file.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("C:/Users/jacin/Documents/SDA_Advanced/ex31.txt");
        Map<String, Integer> wordsMap = new HashMap<>();
        Files.lines(filePath)
                .filter(line -> line != null && !line.isEmpty())
                .forEach(line -> {
                    String[] words = line.split(" ");
                    for (String word : words) {
                                wordsMap.putIfAbsent(word,0);
                                int counter = wordsMap.get(word);
                                wordsMap.put(word,++counter);
                    }
                });
        System.out.println(wordsMap);
        Path filePathOut = Paths.get("C:/Users/jacin/Documents/SDA_Advanced/ex31Out.txt");
        filePathOut.toFile().createNewFile();
        List<String> table = new ArrayList<>();
        table.add("word------------------- occurencies ------------");
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()){
            table.add("-----------------------------------------");
            table.add(entry.getKey()+ " | " + entry.getValue());
        }
        Files.write(filePathOut,table);

    }
}

package com.sda.java_advanced_coding.exercises.ex30;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Write a program that will read any file and save it in the same folder. The content and title of the new file should
 * be reversed (from the back).
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:/Users/jacin/Documents/SDA_Advanced/abcd.txt");
        List<String> fileLines = Files.readAllLines(filePath);
        System.out.println(fileLines);

        String originalFileName = filePath.toFile().getName();
        System.out.println(originalFileName);

        String reverseFileName = new StringBuilder(originalFileName).reverse().toString();
        System.out.println(reverseFileName);

        Path newFilePath = filePath.getParent().resolve(reverseFileName);
        Files.createFile(newFilePath);
    }
}

package com.sda.java_advanced_coding.exercises.ex33;
/**
 * Write a program that will display all photos (.png, .jpg) in a given directory and subdirectories
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Computer computer = new Computer("I7","8GB","NVidia GForce","Dell","G3");
//        writeObject(computer);
        Computer computer1 = readObject("C:/Users/jacin/Documents/SDA_Advanced/ex33.txt");
        System.out.println(computer1);
    }

    public static <T> void writeObject(T object) throws IOException {

        File file = new File("C:/Users/jacin/Documents/SDA_Advanced/ex33.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
        }
    }

    public static <T> T readObject(String filePath) throws IOException, ClassNotFoundException {
        File file = new File(filePath);

        T object;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream =
                     new ObjectInputStream(fileInputStream)) {
            object = (T) objectInputStream.readObject();
        }

        return object;
    }
}

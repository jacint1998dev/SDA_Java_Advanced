package com.sda.collections.sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*Create a set consisting of colors - given from the user.*/

public class Main {
    public static void main(String[] args) {
        Set<String> colours = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        String colour = "";

        while(!colour.equals("stop")){
            System.out.println("Enter a colour: ");
            colour = scanner.nextLine();
            colours.add(colour);

            for (String colourItem:colours){
                System.out.println(colourItem);
            }

        }
    }
}

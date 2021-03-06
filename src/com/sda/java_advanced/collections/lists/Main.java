package com.sda.java_advanced.collections.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Create a List and display its result (data should be provided by the user - console):
- Purchases to be made. *If an element already exists on the list, then it should not be added.
- *Add to the example above the possibility of "deleting" purchased elements
- Display only those purchases that start with „m" (e.g. milk)
- *View only purchases whose next product on the list starts with „m" (e.g. eggs, if milk was next on the list) */
public class Main {
    public static void main(String[] args) {

        List<String> products = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String selectedOption = "";

        while (!selectedOption.equals("stop")) {
            System.out.println("Select option: ");
            selectedOption = scanner.nextLine();

            switch (selectedOption) {
                case "add product":
                    System.out.println("Please insert product name: ");
                    String product = scanner.nextLine();
                    products.add(product);
                    break;
                case "remove product":
                    System.out.println("Please select a product you want to delete: ");
                    String productToBeDeleted = scanner.nextLine();
                    products.remove(productToBeDeleted);
                    break;
                case "product m":
                    for (String prod : products) {
                        if (prod.startsWith("m"))
                            System.out.println(prod);
                    }
                    break;
                case "m2":
                    for (int i = 0; i < products.size(); i++) {
                        String prod = products.get(i);
                        if (prod.startsWith("m")) {
                            if (i > 0) {
                                products.get(i - 1);
                            }
                        }
                    }
                    break;
                case "stop":
                    System.out.println("Program application exit!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
            for (String product : products) {
                System.out.println(product);
            }
        }
    }
}

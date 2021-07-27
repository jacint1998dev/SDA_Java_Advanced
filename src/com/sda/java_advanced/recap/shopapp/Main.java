package com.sda.java_advanced.recap.shopapp;

import com.sda.java_advanced.recap.shopapp.repository.GroceryProductRepository;
import com.sda.java_advanced.recap.shopapp.repository.GroceryProductRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        GroceryProductRepository groceryProducts = new GroceryProductRepositoryImpl();
        System.out.println(groceryProducts.findName("Snapple - Mango Maddness"));
    }
}

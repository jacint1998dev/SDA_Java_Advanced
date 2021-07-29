package com.sda.java_advanced.recap.shopapp.service;

import com.sda.java_advanced.recap.shopapp.repository.GroceryProductRepository;
import com.sda.java_advanced.recap.shopapp.repository.GroceryProductRepositoryImpl;

import java.io.IOException;

public class GroceryProductService {
    private final GroceryProductRepository productRepository = new GroceryProductRepositoryImpl();

    public GroceryProductService() throws IOException {

    }
}

package com.sda.java_advanced.recap.shopapp.repository;

import com.sda.java_advanced.recap.shopapp.model.GroceryProduct;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class GroceryProductRepositoryImpl extends SellableRepositoryImpl<GroceryProduct> implements GroceryProductRepository {

    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    public void loadAll() {
        Path path = Paths.get("C:/Users/jacin/Documents/SDA_Advanced/src/data/groceries.csv");


        try {
            Files.lines(path)
                    .skip(1)
                    .filter(line -> line != null)
                    .filter(line -> !line.isEmpty())
                    .map(line -> {
                        try {
                            String[] arrayElem = line.split("\\|");
                            String id = arrayElem[0];
                            double price = Double.parseDouble(arrayElem[1]);
                            String currency = arrayElem[2];
                            String name = arrayElem[3];
                            String description = arrayElem[4];
                            Date expirationDate = DATE_FORMAT.parse(arrayElem[5]);
                            boolean isBio = Boolean.parseBoolean(arrayElem[6]);
                            String countryOfOrigin = arrayElem[7];
                            return new GroceryProduct(
                                    expirationDate,
                                    isBio,
                                    countryOfOrigin,
                                    id,
                                    price,
                                    currency,
                                    name,
                                    description
                            );
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        }

                    })
                    .filter(groceryProduct -> groceryProduct != null)
                    .forEach(groceryProduct -> add(groceryProduct));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.sda.recap.shopapp.repository;

import com.sda.recap.shopapp.model.Sellable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SellableRepositoryImpl<T extends Sellable> implements SellableRepository<T> {

    private Map<String, T> sellableById = new HashMap<>();


    @Override
    public void add(T item) {
        sellableById.put(item.getID(), item);
    }

    @Override
    public Optional<T> search(String id) {
        T item = sellableById.get(id);
        return Optional.ofNullable(item);
    }

    @Override
    public void remove(String id) {
        sellableById.remove(id);
    }

    @Override
    public Optional<T> findName(String name) {
       return sellableById.values()
                .stream()
                .filter(item -> item.getName().equals(name))
                .findAny();
    }
}

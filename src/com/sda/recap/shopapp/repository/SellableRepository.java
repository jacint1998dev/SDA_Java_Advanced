package com.sda.recap.shopapp.repository;
/**
 * 8. Generic types**
 * - Create a generic interface for a repository that can hold items that are extending Sellable.
 * - This repository should have the fallowing methods:
 * - add(T)
 * - search(Id)
 * - remove(Id)
 * - get(Id)
 */

import com.sda.recap.shopapp.model.Sellable;

import java.util.Optional;

public interface SellableRepository<T extends Sellable> {

    void add(T item);

    Optional<T> search(String id);

    void remove(String id);

    Optional<T> findName(String name);

}

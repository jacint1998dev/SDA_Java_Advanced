package com.sda.java_advanced.genericclass.repository;

import com.sda.java_advanced.genericclass.model.Identifiable;

import java.util.ArrayList;
import java.util.List;


public class IdentifiableRepository<T extends Identifiable> {

    protected List<T> items = new ArrayList<>();

    public void addItems(T item){
        items.add(item);
    }

    public T getItemById(String id){
        for(T item:items){
            if(item.getID().equals(id)){
                return item;
            }
        }
        return null;
    }

    public void removeItemById(String id){

        T itemToBeRemoved=getItemById(id);
        if(itemToBeRemoved != null){
            items.remove(itemToBeRemoved);
        }
    }

}

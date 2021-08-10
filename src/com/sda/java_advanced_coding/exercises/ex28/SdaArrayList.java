package com.sda.java_advanced_coding.exercises.ex28;

import java.util.ArrayList;
import java.util.List;

public class SdaArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int index, int skip) {
        List<E> result = new ArrayList<>();
        if (size() > index) {
            for (int i = 0; i < this.size(); i = i + skip) {
                result.add(get(i));
            }
        }
        return result;
    }
}

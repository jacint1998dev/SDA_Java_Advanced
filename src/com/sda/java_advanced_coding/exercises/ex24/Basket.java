package com.sda.java_advanced_coding.exercises.ex24;

public class Basket {

    private int numberOfElements = 0;


    public void addToBasket() {
        if (numberOfElements >= 10) {
            throw new BasketFullException();
        } else {
            numberOfElements += 1;
        }
    }

    public void removeFromBasket() {
        if (numberOfElements < 1) {
            throw new BasketEmptyException();
        } else {
            numberOfElements -= 1;
        }
    }


    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }
}

package com.sda.java_advanced_coding.exercises.ex15;

public enum Car {
    FERRARI(100000,"400",true),
    PORSCHE(100000,"360",true),
    MERCEDES(20000,"280",true),
    BMW(30000,"270",false),
    OPEL(15000,"140",false),
    FIAT(50000,"150",false),
    TOYOTA(36000,"180",false);

    private int price;
    private String power;
    private boolean isPremium;


    Car(int price, String power, boolean isPremium) {
        this.price = price;
        this.power = power;
        this.isPremium = isPremium;
    }

    public boolean isPremium(){
        return isPremium;
    }

    public boolean isRegular(){
        return !this.isPremium;
    }

    public int getPrice() {
        return price;
    }

    public String getPower() {
        return power;
    }

    public boolean isFasterThan(Car car){
        int currentCarPower = Integer.parseInt(this.power);
        int otherCarPower = Integer.parseInt(car.power);
       return Integer.compare(currentCarPower,otherCarPower) == 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", power='" + power + '\'' +
                '}';
    }
}

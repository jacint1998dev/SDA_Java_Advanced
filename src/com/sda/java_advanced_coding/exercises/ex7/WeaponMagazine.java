package com.sda.java_advanced_coding.exercises.ex7;

import java.util.LinkedList;

public class WeaponMagazine {
    private int maxCapacity;
    private LinkedList<String> bullets;

    public WeaponMagazine(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.bullets = new LinkedList<String>();
    }

    public void loadBullet(String bullet) {
        if (bullets.size() >= maxCapacity) {
            System.out.println("No more space in magazine!");
        } else {
            bullets.addLast(bullet);
        }
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
    }

    public void shot() {
        if (bullets.isEmpty()) {
            System.out.println("No more bullets!");
        } else {
            String bullet = bullets.removeLast();
            System.out.println(bullet);
        }
    }

}

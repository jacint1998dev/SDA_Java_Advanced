package com.sda.design_patterns.template;

import com.sda.design_patterns.template.impl.Firefighter;
import com.sda.design_patterns.template.impl.Manager;
import com.sda.design_patterns.template.impl.Postman;
import com.sda.design_patterns.template.impl.Worker;

public class Main {
    public static void main(String[] args) {
        Worker postman = new Postman();
        Worker manager = new Manager();
        Worker firefighter = new Firefighter();

        postman.printDailyRoutine();
        manager.printDailyRoutine();
        firefighter.printDailyRoutine();
    }
}

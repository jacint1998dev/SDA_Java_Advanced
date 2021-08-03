package com.sda.design_patterns.template.impl;

public class Manager extends Worker {

    @Override
    protected void relax() {
        System.out.println("Goes to the gym");
    }

    @Override
    protected void work() {
        System.out.println("Overviews the production");
    }
}

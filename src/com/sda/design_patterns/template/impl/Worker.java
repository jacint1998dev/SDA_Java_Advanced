package com.sda.design_patterns.template.impl;

public abstract class Worker {

    public final void printDailyRoutine() {
        getUp();
        eatBreakfast();
        goToWork();
        work();
        returnToHome();
        relax();
        sleep();
        System.out.println("------------------");
    }

    protected void getUp() {
        System.out.println("Get up at 7!");
    }

    protected void eatBreakfast() {
        System.out.println("Eat breakfast!");
    }

    protected void goToWork() {
        System.out.println("Go to work!");
    }

    protected void returnToHome() {
        System.out.println("Go home!");
    }

    protected void relax() {
        System.out.println("Relax");
    }

    protected void sleep() {
        System.out.println("Sleep well");
    }

    protected abstract void work();

}

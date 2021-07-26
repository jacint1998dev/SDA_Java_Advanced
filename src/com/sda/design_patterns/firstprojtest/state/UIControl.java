package com.sda.design_patterns.firstprojtest.state;

public abstract class UIControl {
    public void enable(){
        System.out.println("Enabled");
    }
    public abstract void draw();
}

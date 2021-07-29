package com.sda.denisbalaceanu.designpatterns.creational.builder.example;

public class Pizza
{
    private final String name;
    private final int size;
    private final boolean isAddChees;
    private final boolean isAddSauce;
    private final boolean isTakeaway;

    private Pizza(Builder builder)
    {
        this.name = builder.name;
        this.size = builder.size;
        this.isAddChees = builder.isAddChees;
        this.isAddSauce = builder.isAddSauce;
        this.isTakeaway = builder.isTakeaway;
    }

    public String getName()
    {
        return name;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isAddChees()
    {
        return isAddChees;
    }

    public boolean isAddSauce()
    {
        return isAddSauce;
    }

    public boolean isTakeaway()
    {
        return isTakeaway;
    }

    @Override
    public String toString()
    {
        return "Pizza= " + this.getName() + ", Size= " + this.getSize()
                + (this.isAddChees ? ", add chees" : "")
                + (this.isAddSauce ? ", add sauce" : "")
                + (this.isTakeaway ? ", takeaway" : "");
    }

    public static class Builder
    {
        private final String name;
        private final int size;

        private boolean isAddChees;
        private boolean isAddSauce;
        private boolean isTakeaway;

        public Builder(String name, int size)
        {
            this.name = name;
            this.size = size;
        }

        public Builder addChees(boolean isAddChees)
        {
            this.isAddChees = isAddChees;
            return this;
        }

        public Builder addSauce(boolean isAddSauce)
        {
            this.isAddSauce = isAddSauce;
            return this;
        }

        public Builder takeaway(boolean isTakeaway)
        {
            this.isTakeaway = isTakeaway;
            return this;
        }

        public Pizza build()
        {
            return new Pizza(this);
        }

    }
}

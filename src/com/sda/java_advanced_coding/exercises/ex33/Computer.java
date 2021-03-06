package com.sda.java_advanced_coding.exercises.ex33;

import java.util.Objects;

/**
 * Create a Computer class with fields defining computer features: processor, ram, graphics card, company
 * and model. Implement setters, getters, constructor with all fields, toString(), equals() and hashcode()
 * methods.
 * Instantiate several objects and check how the methods work
 */
public class Computer {

  private String processor;
  private String ram;
  private String graphicsCard;
  private String company;
  private String model;

    public Computer(String processor, String ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(
                processor, computer.processor)
                && Objects.equals(ram, computer.ram)
                && Objects.equals(graphicsCard, computer.graphicsCard)
                && Objects.equals(company, computer.company)
                && Objects.equals(model, computer.model
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

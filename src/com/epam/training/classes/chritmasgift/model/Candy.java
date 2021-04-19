package com.epam.training.classes.chritmasgift.model;

import java.util.Objects;

public abstract class Candy {

    private String name;
    private double weight;
    private double price;

    public Candy(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Candy)) {
            return false;
        }
        final Candy candy = (Candy) o;
        return Double.compare(candy.getWeight(), getWeight()) == 0 && Objects.equals(getName(), candy.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight());
    }
}

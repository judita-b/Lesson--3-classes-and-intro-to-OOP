package com.epam.training.classes.chritmasgift.model;

import java.util.Objects;

public class Chocolate extends Candy {

    private double cacaoPercentage;

    public Chocolate(String name, double weight,double price, double cacaoPercentage) {
        super(name, weight, price);
        this.cacaoPercentage = cacaoPercentage;
    }

    public double getCacaoPercentage() {
        return cacaoPercentage;
    }

    public void setCacaoPercentage(double cacaoPercentage) {
        this.cacaoPercentage = cacaoPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Chocolate)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final Chocolate chocolate = (Chocolate) o;
        return Double.compare(chocolate.getCacaoPercentage(), getCacaoPercentage()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCacaoPercentage());
    }
}

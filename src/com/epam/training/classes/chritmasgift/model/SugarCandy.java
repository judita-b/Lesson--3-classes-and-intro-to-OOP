package com.epam.training.classes.chritmasgift.model;

import java.util.Objects;

public class SugarCandy extends Candy {

    private SugarCandyType type;
    private String flavor;
    private boolean isFilling;

    public SugarCandy(String name, double weight, double price, SugarCandyType type, String flavor, boolean isFilling) {
        super(name, weight, price);
        this.type = type;
        this.flavor = flavor;
        this.isFilling = isFilling;
    }

    public SugarCandyType getType() {
        return type;
    }

    public void setType(SugarCandyType type) {
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isFilling() {
        return isFilling;
    }

    public void setFilling(boolean filling) {
        isFilling = filling;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SugarCandy)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final SugarCandy that = (SugarCandy) o;
        return isFilling() == that.isFilling() && getType() == that.getType() && Objects.equals(getFlavor(), that.getFlavor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType(), getFlavor(), isFilling());
    }
}

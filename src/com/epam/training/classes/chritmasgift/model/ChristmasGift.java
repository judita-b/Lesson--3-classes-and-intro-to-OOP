package com.epam.training.classes.chritmasgift.model;

import java.util.ArrayList;
import java.util.List;

public class ChristmasGift {

    private List<Candy> candies;

    public ChristmasGift() {
        candies = new ArrayList<>();
    }

    public void collectChristmasGift(Candy candy) {
        candies.add(candy);
    }

    public List<Candy> getCandies() {
        return candies;
    }
}

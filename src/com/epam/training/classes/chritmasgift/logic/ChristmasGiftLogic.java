package com.epam.training.classes.chritmasgift.logic;

import com.epam.training.classes.chritmasgift.model.Candy;
import com.epam.training.classes.chritmasgift.model.ChristmasGift;

public class ChristmasGiftLogic {


    public static double calculateTotalPrice(ChristmasGift christmasGift) {
        double totalPrice = 0.00;
        for (Candy candy : christmasGift.getCandies()) {
            totalPrice += candy.getPrice();
        }
        return totalPrice;
    }

    public static double calculateTotalWeight(ChristmasGift christmasGift) {
        double totalWeight = 0.00;
        for (Candy candy : christmasGift.getCandies()) {
            totalWeight += candy.getWeight();
        }
        return totalWeight;
    }
}

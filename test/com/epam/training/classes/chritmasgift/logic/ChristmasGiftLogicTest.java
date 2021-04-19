package com.epam.training.classes.chritmasgift.logic;

import com.epam.training.classes.chritmasgift.model.Chocolate;
import com.epam.training.classes.chritmasgift.model.ChristmasGift;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChristmasGiftLogicTest {

    @Test
    public void calculateTotalPriceShouldCalculateWhenNumbersPositive() {
        //Given
        ChristmasGift christmasGift = new ChristmasGift();
        Chocolate chocolate = new Chocolate("Pergale", 10.00, 4.99 , 97.00);
        christmasGift.collectChristmasGift(chocolate);
        //When
        double result = ChristmasGiftLogic.calculateTotalPrice(christmasGift);
        //Then)
        double expected = 4.99;
        assertEquals(expected, result, 0);
    }

    @Test
    public void calculateTotalWeightShouldCalculateWhenNumbersPositive() {
        //Given
        ChristmasGift christmasGift = new ChristmasGift();
        Chocolate chocolate = new Chocolate("Pergale", 10.00, 4.99 , 97.00);
        christmasGift.collectChristmasGift(chocolate);
        //When
        double result = ChristmasGiftLogic.calculateTotalWeight(christmasGift);
        //Then)
        double expected = 10.00;
        assertEquals(expected, result, 0);
    }
}
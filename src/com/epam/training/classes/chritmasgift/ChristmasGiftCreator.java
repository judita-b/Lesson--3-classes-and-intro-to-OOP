package com.epam.training.classes.chritmasgift;

import com.epam.training.classes.chritmasgift.model.Chocolate;
import com.epam.training.classes.chritmasgift.model.ChristmasGift;
import com.epam.training.classes.chritmasgift.model.SugarCandy;
import com.epam.training.classes.chritmasgift.model.SugarCandyType;

public class ChristmasGiftCreator {

    public static ChristmasGift create() {
        Chocolate blackChocolate = new Chocolate("Pergale", 10.00, 4.99 , 97.00);
        Chocolate milkChocolate = new Chocolate("Milka", 10.00, 6.99 , 20.00);
        SugarCandy gummyBears = new SugarCandy("Haribo", 20.00, 5.99, SugarCandyType.SOFT_CANDY, "fruit", false);

        ChristmasGift christmasGift = new ChristmasGift();
        christmasGift.collectChristmasGift(blackChocolate);
        christmasGift.collectChristmasGift(milkChocolate);
        christmasGift.collectChristmasGift(gummyBears);
        System.out.println(christmasGift.toString());
        return christmasGift;
    }
}

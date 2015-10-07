package com.neyd.PriceMenu;

/**
 * Created by Женя on 07.10.2015.
 */
public class Dish {
    int price;
    int number;
    String  type;
    String name;

    public Dish(int number, int price, String type, String name) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String toString() {
        return String.format(
                "%d. %s по ціні %d, типу %s",
               this.number,this.name, this.price, this.type
        );
    }

}

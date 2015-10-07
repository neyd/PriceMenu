package com.neyd.PriceMenu;

/**
 * Created by Женя on 07.10.2015.
 */
public class Dash {
    int price;

    String name;

    public Dash(int price,String name){

        this.name = name;
        this.price = price;

    }

    public String toString() {
        return String.format(
                "%3s по ціні %d",
                this.name,this.price
        );
    }

}

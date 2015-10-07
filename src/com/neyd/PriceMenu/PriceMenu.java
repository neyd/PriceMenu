package com.neyd.PriceMenu;

/**
 * Created by Женя on 07.10.2015.
 */
public class PriceMenu {
    public static void main(String[] args) {

        Dash[] dashs = new Dash[5];
        dashs[0] = new Dash(13, "Гречка");
        dashs[1] = new Dash(8, "Підлива з м'ясом");
        dashs[2] = new Dash(15, "Картошка");
        dashs[3] = new Dash(13, "Відбивна");
        dashs[4] = new Dash(6, "Компот");



        for (int i = 0; i < dashs.length; i++) {
            System.out.println(dashs[i]);

        }
    }
}

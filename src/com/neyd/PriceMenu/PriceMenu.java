package com.neyd.PriceMenu;
import java.util.Scanner;
/**
 * Created by Женя on 07.10.2015.
 */
public class PriceMenu {
    public static void main(String[] args) {
        int money;
        int maxMoney;
        int res;
        int res2;
        Scanner scanner = new Scanner(System.in);
        Dish[] dishs = new Dish[10];
        dishs[0] = new Dish(1, 13, "2-ге", "Гречка");
        dishs[1] = new Dish(2, 8, "Гарнір", "Підлива з м'ясом");
        dishs[2] = new Dish(3, 15, "2-ге", "Картошка");
        dishs[3] = new Dish(4, 13, "Гарнір", "Відбивна");
        dishs[4] = new Dish(5, 6, "Випивка", "Компот");
        dishs[5] = new Dish(6, 11, "Салат", "Цезарь");
        dishs[6] = new Dish(7, 8, "Випивка", "Кока-кола");
        dishs[7] = new Dish(8, 15, "1-ше", "Борщ");
        dishs[8] = new Dish(9, 12, "Фастфуд", "Хот-дог");
        dishs[9] = new Dish(10, 5, "Випічка", "Кекс");
        for (int i = 0; i < dishs.length; i++) {
            System.out.println(dishs[i]);

        }
        System.out.println("Скільки у вас грошей?");
        money = Integer.parseInt(scanner.nextLine());
        maxMoney = money;
        System.out.println("Що будете брати?");
        res = Integer.parseInt(scanner.nextLine());
        while (true) {
            if (money >= dishs[res - 1].price) {
                money = money - dishs[res - 1].price;
                System.out.println("Скільки порцій ви бажаєте?");
                res2 = Integer.parseInt(scanner.nextLine());
                if (res2 >= 1)
                    if (money >= (res2-1)*dishs[res - 1].price) {
                        money = money - (res2-1)*(dishs[res - 1].price);
                    }
                else{
                        money = money + (dishs[res - 1].price);
                        System.out.println("У вас тільки " + money + "грн" + " ви не можете це придбати");
                        System.out.println("З вас " + (maxMoney - money) + "грн");
                    }

                System.out.println("Щось ще будете брати?     " + "У вас залишилось " + money + "грн");
                res = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.println("У вас тільки " + money + "грн" + " ви не можете це придбати");
                System.out.println("З вас " + (maxMoney-money) + "грн");
                break;
            }

            if (res == 0) {
                System.out.println("З вас " + (maxMoney-money) + "грн");
                break;
            }

        }
    }
}

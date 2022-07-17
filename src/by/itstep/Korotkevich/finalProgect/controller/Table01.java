package by.itstep.Korotkevich.finalProgect.controller;

import by.itstep.Korotkevich.finalProgect.model.entity.*;
import by.itstep.Korotkevich.finalProgect.view.Printer;

public class Table01 {
    public static void main(String[] args) {
        Dish[] dishes = {
                new Snack(MenuCategoryEnum.SNACKS, DishesEnum.SALAD, 7, 5),
                new MainDish(MenuCategoryEnum.MAIN_DISH, DishesEnum.PORK, 22, 400),
                new Garnish(MenuCategoryEnum.GARNISH, DishesEnum.POTATOES, 6.5, 150),
                new Desert(MenuCategoryEnum.DESERT, DishesEnum.CAKE, 12, 500),
                new Beverage(MenuCategoryEnum.BEVERAGE, DishesEnum.COFFEE, 5, 250)
        };

        for (int i = 0; i < dishes.length; i++) {
            Printer.print(dishes[i]);
        }

        double totalCheque = Waiter.calculateCheck(dishes);

        Printer.print("Total cheque = " + totalCheque + " $");


    }
}

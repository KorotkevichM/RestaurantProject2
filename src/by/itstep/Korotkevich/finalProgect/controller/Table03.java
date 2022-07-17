package by.itstep.Korotkevich.finalProgect.controller;

import by.itstep.Korotkevich.finalProgect.model.entity.*;
import by.itstep.Korotkevich.finalProgect.view.Printer;

public class Table03 {
    public static void main(String[] args) {
        Dish[] dishes = {
                new Snack(MenuCategoryEnum.SNACKS, DishesEnum.CHEESE, 11.2, 4),
                new MainDish(MenuCategoryEnum.MAIN_DISH, DishesEnum.FISH, 25.8, 300),
                new Garnish(MenuCategoryEnum.GARNISH, DishesEnum.RICE, 7.5, 200),
                new Desert(MenuCategoryEnum.DESERT, DishesEnum.PIE, 11, 328),
                new Beverage(MenuCategoryEnum.BEVERAGE, DishesEnum.WATER, 2, 270)
        };


        for (int i = 0; i < dishes.length; i++) {
            Printer.print(dishes[i]);
        }

        double totalCheque = Waiter.calculateCheck(dishes);

        Printer.print("Total cheque = " + totalCheque + " $");
    }
}


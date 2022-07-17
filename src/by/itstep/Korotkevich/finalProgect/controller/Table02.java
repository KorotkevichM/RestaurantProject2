package by.itstep.Korotkevich.finalProgect.controller;

import by.itstep.Korotkevich.finalProgect.model.entity.*;
import by.itstep.Korotkevich.finalProgect.view.Printer;

public class Table02 {
    public static void main(String[] args) {
        Dish[] dishes = {
                new Snack(MenuCategoryEnum.SNACKS, DishesEnum.BRUSCHETTA, 12, 3),
                new MainDish(MenuCategoryEnum.MAIN_DISH, DishesEnum.BEEF, 29.9, 350),
                new Garnish(MenuCategoryEnum.GARNISH, DishesEnum.VEGGIE, 9, 200),
                new Desert(MenuCategoryEnum.DESERT, DishesEnum.ICE_CREAM, 8.5, 298),
                new Beverage(MenuCategoryEnum.BEVERAGE, DishesEnum.JUICE, 4.7, 300)
        };
        for (int i = 0; i < dishes.length; i++) {
            Printer.print(dishes[i]);
        }

        double totalCheque = Waiter.calculateCheck(dishes);

        Printer.print("Total cheque = " + totalCheque + " $");
    }
}

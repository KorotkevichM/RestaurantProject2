package by.itstep.Korotkevich.finalProgect.view;

import by.itstep.Korotkevich.finalProgect.model.entity.*;

public class Menu {
    public static void main(String[] args) {

        Printer.print("---MENU---");

        Dish[] dishes = {

                new Snack(MenuCategoryEnum.SNACKS, DishesEnum.SALAD, 7,5),
                new Snack(MenuCategoryEnum.SNACKS, DishesEnum.BRUSCHETTA, 12, 3),
                new Snack(MenuCategoryEnum.SNACKS, DishesEnum.CHEESE, 11.2, 4),

                new MainDish(MenuCategoryEnum.MAIN_DISH, DishesEnum.PORK, 22, 400),
                new MainDish(MenuCategoryEnum.MAIN_DISH, DishesEnum.BEEF, 29.9, 350),
                new MainDish(MenuCategoryEnum.MAIN_DISH, DishesEnum.FISH, 25.8, 300),

                new Garnish(MenuCategoryEnum.GARNISH, DishesEnum.POTATOES, 6.5, 150),
                new Garnish(MenuCategoryEnum.GARNISH, DishesEnum.VEGGIE, 9, 200),
                new Garnish(MenuCategoryEnum.GARNISH, DishesEnum.RICE, 7.5, 200),

                new Desert(MenuCategoryEnum.DESERT, DishesEnum.CAKE, 12, 500),
                new Desert(MenuCategoryEnum.DESERT, DishesEnum.ICE_CREAM, 8.5, 298),
                new Desert(MenuCategoryEnum.DESERT, DishesEnum.PIE, 11, 328),

                new Beverage(MenuCategoryEnum.BEVERAGE, DishesEnum.COFFEE, 5, 250),
                new Beverage(MenuCategoryEnum.BEVERAGE, DishesEnum.JUICE, 4.7, 300),
                new Beverage(MenuCategoryEnum.BEVERAGE, DishesEnum.WATER, 2, 270)
        };

        for (int i = 0; i < dishes.length; i++) {
            Printer.print(dishes[i]);
        }
        }

    }


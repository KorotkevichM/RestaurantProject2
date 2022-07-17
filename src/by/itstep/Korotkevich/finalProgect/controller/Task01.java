package by.itstep.Korotkevich.finalProgect.controller;

import by.itstep.Korotkevich.finalProgect.model.entity.Dish;
import by.itstep.Korotkevich.finalProgect.model.entity.DishesEnum;
import by.itstep.Korotkevich.finalProgect.model.entity.MenuCategoryEnum;

public class Task01 {
    public static void main(String[] args) {
        Dish dish = new Dish(MenuCategoryEnum.MAIN_DISH, DishesEnum.BEEF, 25);

        System.out.println(dish);
    }
}
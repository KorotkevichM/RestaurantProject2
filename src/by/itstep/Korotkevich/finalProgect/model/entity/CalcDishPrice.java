package by.itstep.Korotkevich.finalProgect.model.entity;

public class CalcDishPrice {
    public static final double CHEFS_SALARY = 1.2;
    public static final double OTHER_EXPENSES = 1.3;
    public static final double MIN_DISH_PRISE = 0.1;

    public static double calc(double dishPrice) {

        return dishPrice * CHEFS_SALARY * OTHER_EXPENSES;
        }

    }



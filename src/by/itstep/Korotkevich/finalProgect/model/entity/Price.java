package by.itstep.Korotkevich.finalProgect.model.entity;

public class Price {
    public static final double CHEFS_SALARY = 1.2;
    public static final double OTHER_EXPENSES = 1.3;
    public static final double MIN_DISH_PRISE = 0.1;
    private double dishPrice;

    public Price() {
    }

    public Price(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public double getDishPrice() {
        return dishPrice * CHEFS_SALARY * OTHER_EXPENSES;
    }

    public void setDishPrice(double dishPrice) {
        if (dishPrice >= MIN_DISH_PRISE) {
            this.dishPrice = dishPrice;
        }
    }
}

package by.itstep.Korotkevich.finalProgect.model.entity;

public class Waiter {
    public static double calculateCheck(Dish[] dishes) {
        double sum = 0;

        for (int i = 0; i < dishes.length; i++) {
            sum += dishes[i].getDishPrice();
            }

        return sum;
    }
}

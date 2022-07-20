package by.itstep.Korotkevich.finalProgect.model.entity;

public class ChequeTables {
    public static double getTotalCheque01() {
        Dish[] dishes = OrderTables.getOrder01();
        return Waiter.calculateCheck(dishes);
    }

    public static double getTotalCheque02() {
        Dish[] dishes = OrderTables.getOrder02();
        return Waiter.calculateCheck(dishes);
    }

    public static double getTotalCheque03() {
        Dish[] dishes = OrderTables.getOrder03();
        return Waiter.calculateCheck(dishes);
    }
}


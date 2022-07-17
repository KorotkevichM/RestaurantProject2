package by.itstep.Korotkevich.finalProgect.model.entity;

public class Snack extends Dish{

    private int amount;

    public Snack() {
    }

    public Snack(MenuCategoryEnum category, DishesEnum dishName, double dishPrice, int amount) {
        super(category, dishName, dishPrice);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + " (amount = " + amount + ")";
    }
}

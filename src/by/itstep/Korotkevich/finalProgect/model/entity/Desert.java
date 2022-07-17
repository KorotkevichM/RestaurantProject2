package by.itstep.Korotkevich.finalProgect.model.entity;

public class Desert extends Dish{
    private int calories;

    public Desert() {
    }

    public Desert(MenuCategoryEnum category, DishesEnum dishName, double dishPrice, int calories) {
        super(category, dishName, dishPrice);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + calories + " cal)";
    }
}

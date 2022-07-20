package by.itstep.Korotkevich.finalProgect.model.entity;

public class Dish {
protected MenuCategoryEnum category;
protected DishesEnum dishName;
protected double dishPrice;


    public Dish() {

    }

    public Dish(MenuCategoryEnum category, DishesEnum dishName, double dishPrice) {
        this.category = category;
        this.dishName = dishName;
        this.dishPrice = dishPrice;

    }


    public MenuCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(MenuCategoryEnum category) {
        this.category = category;
    }

    public DishesEnum getDishName() {
        return dishName;
    }

    public void setDishName(DishesEnum dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        if (dishPrice > 0) {
            this.dishPrice = dishPrice;
        }
    }

    @Override
    public String toString() {
        return category + " - " + dishName + " ..... "
                + dishPrice + " $";
    }
}

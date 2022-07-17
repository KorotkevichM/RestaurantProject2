package by.itstep.Korotkevich.finalProgect.model.entity;

public class Garnish extends Dish{
    private int weight;

    public Garnish() {
    }

    public Garnish(MenuCategoryEnum category, DishesEnum dishName, double dishPrice, int weight) {
        super(category, dishName, dishPrice);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + weight + " g)";
    }
}

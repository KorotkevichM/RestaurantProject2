package by.itstep.Korotkevich.finalProgect.model.entity;

public class MainDish extends Dish {

    private int weight;

    public MainDish() {
    }


    public MainDish(MenuCategoryEnum category, DishesEnum dishName, double dishPrice, int weight) {
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

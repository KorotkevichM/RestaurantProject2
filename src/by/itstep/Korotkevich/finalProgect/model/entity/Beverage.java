package by.itstep.Korotkevich.finalProgect.model.entity;

public class Beverage extends Dish{
    private int volume;

    public Beverage() {
    }

    public Beverage(MenuCategoryEnum category, DishesEnum dishName, double dishPrice, int volume) {
        super(category, dishName, dishPrice);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if (volume > 0) {
            this.volume = volume;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (" + volume + " ml)";
    }
}

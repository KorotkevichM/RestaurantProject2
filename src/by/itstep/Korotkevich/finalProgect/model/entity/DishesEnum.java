package by.itstep.Korotkevich.finalProgect.model.entity;

public enum DishesEnum {
    SALAD ("Vegetable mix"),
    CHEESE("Fried cheese"),
    BRUSCHETTA ("Bruschetta set"),

    PORK ("Pork medallions"),
    BEEF("Beef steak"),
    FISH("Grilled fish"),

    POTATOES ("French fries"),
    RICE ("Spicy rice"),
    VEGGIE ("Grilled vegetables"),

    CAKE ("Napoleon cake"),
    ICE_CREAM ("Ice cream with topping"),
    PIE ("Cherry strudel"),

    WATER ("Water with ice"),
    COFFEE ("Americano coffee"),
    JUICE ("Orange juice");


    private String dish;
    DishesEnum(String dish) {
        this.dish = dish;
    }

    public String getDish(){
        return dish;
    }

    public String toString(){
        return dish;
    }
}

package by.itstep.Korotkevich.finalProgect.model.entity;

public enum MenuCategoryEnum {
    SNACKS("SNACKS"),
    MAIN_DISH("MAIN DISH"),
    GARNISH ("GARNISH"),
    DESERT ("DESERTS"),
    BEVERAGE ("BEVERAGES");

    private String category;

    MenuCategoryEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return category;
    }
}


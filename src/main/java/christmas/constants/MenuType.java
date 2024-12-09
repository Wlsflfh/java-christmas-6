package christmas.constants;

import static christmas.constants.Product.*;

import java.util.List;

public enum MenuType {
    APPETIZER(List.of(MUSHROOM_SOUP, TAPAS, CAESAR_SALAD)),
    MAIN(List.of(T_BONE_STAKE, BBQ_LIBS, SEA_FOOD_PASTA, CHRISTMAS_PASTA)),
    DESSERT(List.of(CHOCOLATE_CAKE, ICE_CREAM)),
    DRINK(List.of(ZERO_COKE, RED_WINE, CHAMPAGNE));

    private final List<Product> products;

    MenuType(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
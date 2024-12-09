package christmas.constants;

public enum MenuType {
    APPETIZER(List.of(MUSHROOM_SOUP, TAPAS, CAESAR_SALAD)),
    MAIN(List.of(T_BONE_STAKE, BBQ_LIBS, SEA_FOOD_PASTA, CHRISTMAS_PASTA)),
    DRINK(List.of(ZERO_COKE, RED_WINE, CHAMPAGNE)),
    DESERT(List.of(ICE_CREAM, CHOCOLATE_CAKE));

    private final List<Product> products;

    MenuType(List<Product> products) {
        this.products = products;
    }
    ...
}
package christmas.domain.vo;

import java.util.Arrays;

public enum Product {
    MUSHROOM_SOUP("양송이수프", 6_000L),
    TAPAS("타파스", 5_500L),
    CAESAR_SALAD("시저샐러드", 8_000L),
    T_BONE_STAKE("티본스테이크", 55_000L),
    BBQ_LIBS("바비큐립", 54_000L),
    SEA_FOOD_PASTA("해산물파스타", 35_000L),
    ...

    private final String name;
    private final Long price;

    Product(String name, Long price) {
        this.name = name;
        this.price = price;
    }
    ...
}

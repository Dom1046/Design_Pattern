package dpattern.factory.factoryLast.ingredient;

import java.util.ArrayList;
import java.util.List;

public class MrPizzaIngredient implements IngredientMarket {
    public final String SAUCE = "MrPizza special sauce";

    private final String BUN = "bun";
    public final String CHEESE = "cheese";
    public final String LETTUCE = "lettuce";
    public final String GARLIC = "garlic";
    public final String TOMATO = "tomato";
    public final String OLIVE = "olive";
    public final String PEPPERONI = "pepperoni";
    public final String DOUGH = "dough";

    @Override
    public List<String> sellIngredient() {
        System.out.println("재료를 준비합니다... ");
        System.out.print(": ");
        List<String> ingredient = new ArrayList<>();
        ingredient.add(SAUCE);
        ingredient.add(BUN);
        ingredient.add(CHEESE);
        ingredient.add(LETTUCE);
        ingredient.add(GARLIC);
        ingredient.add(TOMATO);
        ingredient.add(OLIVE);
        ingredient.add(PEPPERONI);
        ingredient.add(DOUGH);
        return ingredient;
    }
}

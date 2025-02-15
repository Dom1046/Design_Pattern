package dpattern.factory.factoryLast.factory;

import dpattern.factory.factoryLast.ingredient.IngredientMarket;
import dpattern.factory.factoryLast.ingredient.MrPizzaIngredient;
import dpattern.factory.factoryLast.ingredient.PaikIngredient;
import dpattern.factory.factoryLast.ingredient.PizzaHutIngredient;
import dpattern.factory.factoryLast.pizza.MrPizza;
import dpattern.factory.factoryLast.pizza.PaikPizza;
import dpattern.factory.factoryLast.pizza.Pizza;
import dpattern.factory.factoryLast.pizza.PizzaHut;

import java.util.List;

import static dpattern.factory.factoryLast.factory.PizzaType.*;

public class PizzaFactory extends Pizza{

    public Pizza orderPizza(String order) {
        return createPizza(order.toUpperCase());
    }

    private Pizza createPizza(String type){
        Pizza pizza;
        if(type.equals(PAIK.name())){
            System.out.println(useIngredient(new PaikIngredient().sellIngredient()));

            pizza = new PaikPizza();
            pizza.make();

            return pizza;
        }else if(type.equals(MR.name())){
            System.out.println(useIngredient(new MrPizzaIngredient().sellIngredient()));

            pizza = new MrPizza();
            pizza.make();

            return pizza;
        }else if(type.equals(HUT.name())){
            System.out.println(useIngredient(new PizzaHutIngredient().sellIngredient()));

            pizza = new PizzaHut();
            pizza.make();

            return pizza;
        }return null;
    }

    private StringBuilder useIngredient(List<String> ingredient) {
        StringBuilder ingredientList = new StringBuilder();
        for(int i=0;i<ingredient.size();i++){
            if (i == ingredient.size() -1){
                ingredientList.append(ingredient.get(i));
            }else ingredientList.append(ingredient.get(i)).append(", ");
        }
        return ingredientList;
    }
}

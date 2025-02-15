package dpattern.factory.factoryLast;

import dpattern.factory.factoryLast.factory.PizzaFactory;
import dpattern.factory.factoryLast.pizza.Pizza;

public class TestOrderPizza {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        String order;

        order = "mr";
        getOrder(pizzaFactory, order);

        order = "paik";
        getOrder(pizzaFactory, order);

        order = "hut";
        getOrder(pizzaFactory, order);
    }

    private static void getOrder(PizzaFactory pizzaFactory, String order) {
        Pizza pizza;
        pizza = pizzaFactory.orderPizza(order);
        System.out.println(pizza+" 피자가 완성되었습니다.");
        System.out.println();
    }
}

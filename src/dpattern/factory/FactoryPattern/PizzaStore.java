package dpattern.factory.FactoryPattern;

public class PizzaStore {
    private final PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    Pizza orderPizza(String order){
        return pizzaFactory.createPizza(order);
    };
}

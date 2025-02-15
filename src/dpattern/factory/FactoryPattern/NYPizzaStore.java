package dpattern.factory.FactoryPattern;

public class NYPizzaStore  {
    Pizza createPizza(String type) {
        return new NYPizza();
    }
}

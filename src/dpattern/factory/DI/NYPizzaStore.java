package dpattern.factory.DI;

public class NYPizzaStore  {
    Pizza createPizza(String type) {
        return new NYPizza();
    }
}

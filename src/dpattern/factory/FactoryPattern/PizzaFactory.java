package dpattern.factory.FactoryPattern;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Hawaii")) {
            return new HawaiiPizza();
        }else if (type.equals("NewYork")) {
            return new NYPizza();
        }
        return pizza;
    }
}

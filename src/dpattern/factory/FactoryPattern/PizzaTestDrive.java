package dpattern.factory.FactoryPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        Pizza newYorkPizza = pizzaStore.orderPizza("NewYork");
        System.out.println("A ordered a " + newYorkPizza.getName());
        newYorkPizza.prepare();
        newYorkPizza.bake();
        newYorkPizza.cut();
        newYorkPizza.box();

        System.out.println();

        Pizza hawaiiPizza = pizzaStore.orderPizza("Hawaii");
        System.out.println("B ordered a " + hawaiiPizza.getName());
        hawaiiPizza.prepare();
        hawaiiPizza.bake();
        hawaiiPizza.cut();
        hawaiiPizza.box();
    }
}

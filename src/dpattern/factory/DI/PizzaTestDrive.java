package dpattern.factory.DI;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        Pizza newYorkPizza = pizzaStore.orderPizza("NewYork");
        System.out.println("A ordered a " + newYorkPizza.getName());
        makingPizza(newYorkPizza);

        System.out.println();

        Pizza hawaiiPizza = pizzaStore.orderPizza("Hawaii");
        System.out.println("B ordered a " + hawaiiPizza.getName());
        makingPizza(hawaiiPizza);
    }
    public static void makingPizza(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}

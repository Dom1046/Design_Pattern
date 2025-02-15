package dpattern.factory.DependentFactoryPattern;

public class DependantPizzaStore {
    public static void main(String[] args) {
        String order = "Hawaii";
        if (order.equals("Hawaii")) {
            HawaiiPizza hawaiiPizza = new HawaiiPizza();
            System.out.println("hawaiiPizza = " + hawaiiPizza);
        }
        order = "NewYork";
        if (order.equals("NewYork")) {
            NYPizza nyPizza = new NYPizza();
            System.out.println("nyPizza = " + nyPizza);
        }
    }
}

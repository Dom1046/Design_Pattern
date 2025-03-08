package dpattern.beverage;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Milk(beverage2);
        beverage2 = new Soy(beverage2);
        String description = beverage2.getDescription();
        System.out.println("description = " + description);
        double cost = beverage2.cost();
        System.out.println("cost = " + cost);

        Beverage beverage3 = new HouseBlend();
        beverage3.getDescription();
        beverage3.cost();
    }
}

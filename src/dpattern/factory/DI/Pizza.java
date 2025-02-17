package dpattern.factory.DI;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...." + dough);
        System.out.println("adding sauce..." + sauce);

        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("sparkling"+ toppings.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName(){
        return name;
    }
}

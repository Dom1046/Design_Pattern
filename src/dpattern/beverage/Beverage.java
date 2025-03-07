package dpattern.beverage;

public abstract class Beverage {
    public String description;

    String getDescription(){
        return description;
    }
    public abstract double cost();
}

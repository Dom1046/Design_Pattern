package dpattern.beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 우유추가";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}

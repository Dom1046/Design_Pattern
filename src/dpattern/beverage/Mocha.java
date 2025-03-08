package dpattern.beverage;

public class Mocha extends Beverage {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0;
    }

}

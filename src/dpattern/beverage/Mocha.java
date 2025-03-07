package dpattern.beverage;

public class Mocha extends Beverage {
    Beverage beverage;

    @Override
    String getDescription() {
        return beverage.getDescription();
    }

    @Override
    void cost() {
        beverage.cost();
    }

}

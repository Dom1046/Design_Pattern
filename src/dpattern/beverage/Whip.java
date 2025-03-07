package dpattern.beverage;

public class Whip extends Beverage {
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

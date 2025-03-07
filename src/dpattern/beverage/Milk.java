package dpattern.beverage;

public class Milk extends CondimentDecorator {
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

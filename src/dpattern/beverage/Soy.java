package dpattern.beverage;

public class Soy extends Beverage{
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

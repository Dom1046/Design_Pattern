package dpattern.beverage;

public class Whip extends Beverage {
    Beverage beverage;

    @Override
    String getDescription() {
        return beverage.getDescription() + " 휘핑크림추가";
    }

    @Override
    public double cost() {
        return beverage.cost() + .5;
    }


}

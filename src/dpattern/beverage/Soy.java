package dpattern.beverage;

public class Soy extends Beverage{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + " 두유 추가";
    }

    @Override
    public double cost() {
        return beverage.cost() + .7;
    }

}

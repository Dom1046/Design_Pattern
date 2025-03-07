package dpattern.beverage;

public class Espresso extends Beverage{

    public Espresso() {
        description = "쌉쌉할 에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

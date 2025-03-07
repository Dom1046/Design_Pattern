package dpattern.beverage;

public class Decaf extends Beverage{

    public Decaf() {
        description = "잠이 솔솔오는 디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

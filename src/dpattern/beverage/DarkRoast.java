package dpattern.beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "짙은 다크로스트 커피";
    }

    @Override
    public double cost() {
        return .99;
    }
}

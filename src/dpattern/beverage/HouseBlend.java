package dpattern.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "은은한 향의 하우스 블렌드임";
    }

    @Override
    public double cost() {
        return .89;
    }
}

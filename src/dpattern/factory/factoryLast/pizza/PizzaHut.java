package dpattern.factory.factoryLast.pizza;

public class PizzaHut extends Pizza{

    @Override
    public void bake() {
        System.out.println("2000도 고열에서 피자가 굽히고 있다.");
    }

    @Override
    public void putTopping() {
        System.out.println("토핑뿌리기 기계가 토핑 뿌리는중..");
    }

    @Override
    public void rollDough() {
        System.out.println("기계에서 밀가루 반죽이 동그랗게 나온다");
    }

    @Override
    public void boxUp() {
        System.out.println("포장기계로 피자가 포장되고 있다.");
    }

    @Override
    public String toString() {
        return "PizzaHut";
    }
}

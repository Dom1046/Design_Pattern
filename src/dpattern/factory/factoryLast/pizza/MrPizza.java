package dpattern.factory.factoryLast.pizza;

public class MrPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("후라이팬에 피자를 올려 지글지글 소리가 난다.");
    }
    @Override
    public void putTopping() {
        System.out.println("알바생들이 토핑을 예쁘게 올려고 노력한다.");
    }

    @Override
    public void rollDough() {
        System.out.println("냉동 반죽이 전자렌지에서 해동중...");
    }

    @Override
    public void boxUp() {
        System.out.println("포장은 셀프로 되어 고객이 직접 포장중이다.");
    }

    @Override
    public String toString() {
        return "MrPizza";
    }
}

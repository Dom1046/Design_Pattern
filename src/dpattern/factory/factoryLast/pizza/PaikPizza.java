package dpattern.factory.factoryLast.pizza;

public class PaikPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("백종원 아저씨가 머금은 술을 뿌리며 불길이 피자를 휩싼다.");
    }

    @Override
    public void putTopping() {
        System.out.println("백종원 특제 토핑 뿌리기 스킬 작렬중!");
    }

    @Override
    public void rollDough() {
        System.out.println("백종원 아저씨의 롤링 기술 선보인다");
    }

    @Override
    public void boxUp() {
        System.out.println("시급 10000원 알바생이 빠른 손놀림으로 피자를 박스에 포장하는 중...");
    }

    @Override
    public String toString() {
        return "PaikPizza";
    }
}

package dpattern.duck;

public class ToyDuck extends Duck{
    public ToyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void getAttacked() {
        System.out.println("가만히 있습니다.");
    }

    @Override
    void swim() {
        System.out.println("단지 물에 뜨기만 할 뿐입니다.");
    }

    @Override
    void display() {
        System.out.println("저는 고무 인형 오리입니다.");
    }
}

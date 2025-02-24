package dpattern.duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void getAttacked(){
        quackBehavior.quack();
        flyBehavior.fly();
    }

    @Override
    void swim() {
        System.out.println("물에 뜹니다.");
    }

    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}

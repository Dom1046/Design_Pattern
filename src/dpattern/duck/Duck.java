package dpattern.duck;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    };

    abstract void getAttacked();

    public void performFly(){
        flyBehavior.fly();
    }
    abstract void swim();
    abstract void display();
    //기타 오리 관련 메소드

}

package dpattern.duck;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();

        duck.display();
        duck.getAttacked();

        duck = new ToyDuck();
        duck.performFly();
        duck.display();
        duck.swim();
        duck.getAttacked();
        duck.performQuack();
    }
}

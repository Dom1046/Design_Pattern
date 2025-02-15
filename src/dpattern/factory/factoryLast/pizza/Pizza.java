package dpattern.factory.factoryLast.pizza;

public abstract class Pizza {

    public void make(){
        System.out.println();
        rollDough();
        bake();
        putTopping();
        boxUp();
    }
    public void bake(){
        System.out.println("Bake on pizza");
    };
    public void putTopping(){
        System.out.println("Topping Pizza");
    };
    public void rollDough() {
        System.out.println("roll dough");
    }
    public void boxUp() {
        System.out.println("box up");
    }

}
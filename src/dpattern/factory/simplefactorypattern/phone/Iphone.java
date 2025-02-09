package dpattern.factory.simplefactorypattern.phone;

public class Iphone implements Phone{
    @Override
    public void info() {
        System.out.println("아이폰 입니다.");
    }

    @Override
    public void call() {
        System.out.println("아이폰 소리를 내며 전화합니다. 아이폰 아이폰 아이폰");
    }
    @Override
    public String toString() {
        return "아이폰";
    }
}

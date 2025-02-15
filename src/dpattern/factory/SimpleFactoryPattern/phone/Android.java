package dpattern.factory.SimpleFactoryPattern.phone;

public class Android implements Phone{
    @Override
    public void info() {
        System.out.println("안드로이드 핸드폰입니다.");
    }

    @Override
    public void call() {
        System.out.println("안드로이드 소리를 내며 전화합니다. 안드로이드 안드로이드 안드로이드");
    }

    @Override
    public String toString() {
        return "안드로이드 폰";
    }
}

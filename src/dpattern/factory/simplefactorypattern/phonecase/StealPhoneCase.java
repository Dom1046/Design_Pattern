package dpattern.factory.simplefactorypattern.phonecase;

public class StealPhoneCase implements PhoneCase{
    @Override
    public void coverPhone() {
        System.out.println("철로 폰 감싸기");
    }
    public void beHard(){
        System.out.println("핸드폰이 단단해졌습니다.");
    }

    @Override
    public String toString() {
        return "강철해드폰 케이스";
    }
}

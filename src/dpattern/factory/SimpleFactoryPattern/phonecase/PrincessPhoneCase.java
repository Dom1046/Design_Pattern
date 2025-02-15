package dpattern.factory.SimpleFactoryPattern.phonecase;

public class PrincessPhoneCase implements PhoneCase{
    @Override
    public void coverPhone() {
        System.out.println("공주님 디자인으로 폰을 감쌉니다.");
    }
    public void blink(){
        System.out.println("핸드폰이 빛이납니다.");
    }

    @Override
    public String toString() {
        return "공주님 핸드폰 케이스";
    }
}

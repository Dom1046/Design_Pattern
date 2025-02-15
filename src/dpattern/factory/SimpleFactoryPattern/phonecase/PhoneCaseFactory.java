package dpattern.factory.SimpleFactoryPattern.phonecase;

public class PhoneCaseFactory {
    public PhoneCase getOrder(Material material) {
        PhoneCase phoneCase = createPhoneCase(material);
        phoneCase.coverPhone();
        if (phoneCase instanceof PrincessPhoneCase) {
            ((PrincessPhoneCase) phoneCase).blink();
        }
        if (phoneCase instanceof StealPhoneCase) {
            ((StealPhoneCase) phoneCase).beHard();
        }
        return phoneCase;
    }
    public PhoneCase createPhoneCase(Material material) {
        switch (material){
            case STEAL: return new StealPhoneCase();
            case PRINCESS: return new PrincessPhoneCase();
            default: return null;
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

package dpattern.factory.simplefactorypattern.phone;

public class PhoneFactory {
    public Phone getOrder(Type type){
        Phone phone = createPhone(type);
        phone.info();
        phone.call();
        return phone;
    }
    public Phone createPhone(Type type){
        switch (type){
            case IPHONE: return new Iphone();
            case ANDROID: return new Android();
            default: return null;
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

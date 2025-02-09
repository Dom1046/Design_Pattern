package dpattern.factory.simplefactorypattern.product;

import dpattern.factory.simplefactorypattern.phone.Phone;
import dpattern.factory.simplefactorypattern.phone.PhoneFactory;
import dpattern.factory.simplefactorypattern.phone.Type;
import dpattern.factory.simplefactorypattern.phonecase.Material;
import dpattern.factory.simplefactorypattern.phonecase.PhoneCase;
import dpattern.factory.simplefactorypattern.phonecase.PhoneCaseFactory;

public class ProductFactory implements Product {

    private Phone phone;
    private PhoneCase phoneCase;

    private ProductFactory(Phone phone, PhoneCase phoneCase) {
        this.phone = phone;
        this.phoneCase = phoneCase;
    }

    public static Product getOrder(Type type, Material material) {
        Product product = createProduct(type, material);
        product.complete();
        return product;
    }
    public static ProductFactory createProduct(Type type, Material material) {
        return new ProductFactory(
                new PhoneFactory().getOrder(type),
                new PhoneCaseFactory().getOrder(material)
        );
    }

    @Override
    public void complete() {
        System.out.println("물건이 완성되었습니다.");
    }

    @Override
    public String toString() {
        return "물건정보 {핸드폰 종류: " + phone.toString() + ", 케이스 종류: " + phoneCase.toString() + "}";
    }
}

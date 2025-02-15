package dpattern.factory.SimpleFactoryPattern;

import dpattern.factory.SimpleFactoryPattern.phone.Type;
import dpattern.factory.SimpleFactoryPattern.phonecase.Material;
import dpattern.factory.SimpleFactoryPattern.product.Product;
import static dpattern.factory.SimpleFactoryPattern.phone.Type.*;
import static dpattern.factory.SimpleFactoryPattern.phonecase.Material.*;
import static dpattern.factory.SimpleFactoryPattern.product.ProductFactory.getOrder;

public class Customer {
    public static void main(String[] args) {
        Type type = IPHONE;
        Material material = PRINCESS;
        Product product = getOrder(type, material);
        System.out.println(product);

        System.out.println();

        type = ANDROID;
        material = STEAL;
        product = getOrder(type, material);

        System.out.println(product);
    }
}

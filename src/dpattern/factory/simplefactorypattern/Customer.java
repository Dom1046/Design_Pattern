package dpattern.factory.simplefactorypattern;

import dpattern.factory.simplefactorypattern.phone.Type;
import dpattern.factory.simplefactorypattern.phonecase.Material;
import dpattern.factory.simplefactorypattern.product.Product;
import static dpattern.factory.simplefactorypattern.phone.Type.*;
import static dpattern.factory.simplefactorypattern.phonecase.Material.*;
import static dpattern.factory.simplefactorypattern.product.ProductFactory.getOrder;

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

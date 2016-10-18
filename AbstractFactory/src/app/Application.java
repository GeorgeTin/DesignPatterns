package app;

import enums.ShoesBrand;
import enums.ShoesType;
import factories.FactoryProducer;
import factories.ShoesFactory;
import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class Application {

    public static void main(String[] args) {
        ShoesFactory shoesFactory = FactoryProducer.createShoes(ShoesBrand.ADIDAS);
        Shoes shoes = shoesFactory.getShoes(ShoesType.CASUAL);
        System.out.println(shoes.getDescription());
    }
}

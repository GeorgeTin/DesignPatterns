package factories;

import enums.ShoesBrand;
import factories.impl.*;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class FactoryProducer {

        public static ShoesFactory createShoes(ShoesBrand type) {
            ShoesFactory shoesFactory;

        switch (type) {
            case ADIDAS:
                shoesFactory = new AdidasShoesFactory();
                break;
            case PUMA:
                shoesFactory = new PumaShoesFactory();
                break;
            case NIKE:
                shoesFactory = new NikeShoesFactory();
                break;
            case TIMBERLAND:
                shoesFactory = new TimberlandShoesFactory();
                break;
            case REEBOK:
                shoesFactory = new ReebokShoesFactory();
                break;
            default:
                shoesFactory = null;
                break;
        }

        return shoesFactory;
    }

}

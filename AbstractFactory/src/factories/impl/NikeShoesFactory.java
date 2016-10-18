package factories.impl;

import enums.ShoesType;
import shoes.Shoes;
import factories.ShoesFactory;
import shoes.casual.CasualNike;
import shoes.office.OfficeNike;
import shoes.sport.SportNike;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class NikeShoesFactory extends ShoesFactory {
    @Override
    public Shoes getShoes(ShoesType type) {
        Shoes shoes;
        switch (type) {
            case CASUAL:
                shoes = new CasualNike();
                break;
            case OFFICE:
                shoes = new OfficeNike();
                break;
            case SPORT:
                shoes = new SportNike();
                break;
            default:
                shoes = null;
                break;
        }
        return shoes;
    }
}

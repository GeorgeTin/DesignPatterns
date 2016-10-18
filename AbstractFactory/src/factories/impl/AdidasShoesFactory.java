package factories.impl;

import enums.ShoesType;
import shoes.Shoes;
import factories.ShoesFactory;
import shoes.casual.CasualAdidas;
import shoes.office.OfficeAdidas;
import shoes.sport.SportAdidas;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class AdidasShoesFactory extends ShoesFactory {

    @Override
    public Shoes getShoes(ShoesType type) {
        Shoes shoes;
        switch (type){
            case CASUAL:
                shoes = new CasualAdidas();
                break;
            case OFFICE:
                shoes = new OfficeAdidas();
                break;
            case SPORT:
                shoes = new SportAdidas();
                break;
            default:
                shoes = null;
                break;
        }
        return shoes;
    }
}

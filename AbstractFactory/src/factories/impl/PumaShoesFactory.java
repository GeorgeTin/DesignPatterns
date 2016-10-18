package factories.impl;

import enums.ShoesType;
import shoes.Shoes;
import factories.ShoesFactory;
import shoes.casual.CasualAdidas;
import shoes.casual.CasualPuma;
import shoes.office.OfficeAdidas;
import shoes.office.OfficePuma;
import shoes.sport.SportAdidas;
import shoes.sport.SportPuma;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class PumaShoesFactory extends ShoesFactory {
    @Override
    public Shoes getShoes(ShoesType type) {
        Shoes shoes;
        switch (type){
            case CASUAL:
                shoes = new CasualPuma();
                break;
            case OFFICE:
                shoes = new OfficePuma();
                break;
            case SPORT:
                shoes = new SportPuma();
                break;
            default:
                shoes = null;
                break;
        }
        return shoes;
    }
}

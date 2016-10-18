package factories.impl;

import enums.ShoesType;
import shoes.Shoes;
import factories.ShoesFactory;
import shoes.casual.CasualAdidas;
import shoes.casual.CasualReebok;
import shoes.office.OfficeAdidas;
import shoes.office.OfficeReebok;
import shoes.sport.SportAdidas;
import shoes.sport.SportReebok;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class ReebokShoesFactory extends ShoesFactory {
    @Override
    public Shoes getShoes(ShoesType type) {
        Shoes shoes;
        switch (type){
            case CASUAL:
                shoes = new CasualReebok();
                break;
            case OFFICE:
                shoes = new OfficeReebok();
                break;
            case SPORT:
                shoes = new SportReebok();
                break;
            default:
                shoes = null;
                break;
        }
        return shoes;
    }
}

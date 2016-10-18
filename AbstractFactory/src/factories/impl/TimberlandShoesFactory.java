package factories.impl;

import enums.ShoesType;
import shoes.Shoes;
import factories.ShoesFactory;
import shoes.casual.CasualTimberland;
import shoes.office.OfficeTimberland;
import shoes.sport.SportTimberland;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class TimberlandShoesFactory extends ShoesFactory {
    @Override
    public Shoes getShoes(ShoesType type) {
        Shoes shoes;
        switch (type){
            case CASUAL:
                shoes = new CasualTimberland();
                break;
            case OFFICE:
                shoes = new OfficeTimberland();
                break;
            case SPORT:
                shoes = new SportTimberland();
                break;
            default:
                shoes = null;
                break;
        }
        return shoes;
    }
}

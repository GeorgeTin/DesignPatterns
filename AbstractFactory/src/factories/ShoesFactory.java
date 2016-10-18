package factories;

import enums.ShoesType;
import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public abstract class ShoesFactory {

    public abstract Shoes getShoes(ShoesType type);
}

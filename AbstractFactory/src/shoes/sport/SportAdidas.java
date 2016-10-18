package shoes.sport;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class SportAdidas implements Shoes {
    @Override
    public String getDescription() {
        return "The Sport Adidas Shoes are white.";
    }

    @Override
    public Integer getPrice() {
        return 240;
    }
}

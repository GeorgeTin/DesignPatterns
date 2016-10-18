package shoes.casual;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class CasualAdidas implements Shoes {
    @Override
    public String getDescription() {
        return "The Casual Adidas Shoes are white.";
    }

    @Override
    public Integer getPrice() {
        return 240;
    }
}

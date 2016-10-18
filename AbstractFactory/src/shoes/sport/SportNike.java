package shoes.sport;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class SportNike implements Shoes {
    @Override
    public String getDescription() {
        return "The Sport Nike Shoes are heavy";
    }

    @Override
    public Integer getPrice() {
        return 320;
    }
}

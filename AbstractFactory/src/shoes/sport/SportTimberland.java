package shoes.sport;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class SportTimberland implements Shoes {
    @Override
    public String getDescription() {
        return "The Sport Timberland Shoes are expensive";
    }

    @Override
    public Integer getPrice() {
        return 560;
    }
}

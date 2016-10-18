package shoes.sport;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class SportPuma implements Shoes {
    @Override
    public String getDescription() {
        return "The Sport Puma Shoes are red";
    }

    @Override
    public Integer getPrice() {
        return 175;
    }
}

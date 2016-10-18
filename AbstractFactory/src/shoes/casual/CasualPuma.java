package shoes.casual;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class CasualPuma implements Shoes {
    @Override
    public String getDescription() {
        return "The Casual Puma Shoes are red";
    }

    @Override
    public Integer getPrice() {
        return 175;
    }
}

package shoes.casual;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class CasualNike implements Shoes {
    @Override
    public String getDescription() {
        return "The Casual Nike Shoes are heavy";
    }

    @Override
    public Integer getPrice() {
        return 320;
    }
}

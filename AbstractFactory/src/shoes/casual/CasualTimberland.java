package shoes.casual;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class CasualTimberland implements Shoes {
    @Override
    public String getDescription() {
        return "The Casual Timberland Shoes are expensive";
    }

    @Override
    public Integer getPrice() {
        return 560;
    }
}

package shoes.casual;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class CasualReebok implements Shoes {
    @Override
    public String getDescription() {
        return "The Casual Reebok Shoes are made out of synthetic leather";
    }

    @Override
    public Integer getPrice() {
        return 430;
    }
}

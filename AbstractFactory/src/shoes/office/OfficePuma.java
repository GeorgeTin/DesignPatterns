package shoes.office;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class OfficePuma implements Shoes {
    @Override
    public String getDescription() {
        return "The Office Puma Shoes are red";
    }

    @Override
    public Integer getPrice() {
        return 175;
    }
}

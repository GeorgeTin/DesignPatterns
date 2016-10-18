package shoes.office;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class OfficeReebok implements Shoes {
    @Override
    public String getDescription() {
        return "The Office Reebok Shoes are made out of synthetic leather";
    }

    @Override
    public Integer getPrice() {
        return 430;
    }
}

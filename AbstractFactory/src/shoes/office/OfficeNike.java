package shoes.office;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class OfficeNike implements Shoes {
    @Override
    public String getDescription() {
        return "The Office Nike Shoes are heavy";
    }

    @Override
    public Integer getPrice() {
        return 320;
    }
}

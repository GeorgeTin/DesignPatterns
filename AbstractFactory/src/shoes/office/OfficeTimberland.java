package shoes.office;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class OfficeTimberland implements Shoes {
    @Override
    public String getDescription() {
        return "The Office Timberland Shoes are expensive";
    }

    @Override
    public Integer getPrice() {
        return 560;
    }
}

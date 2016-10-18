package shoes.office;

import shoes.Shoes;

/**
 * Created by George.Tantareanu on 10/18/2016.
 */
public class OfficeAdidas implements Shoes {
    @Override
    public String getDescription() {
        return "The Office Adidas Shoes are white.";
    }

    @Override
    public Integer getPrice() {
        return 240;
    }
}

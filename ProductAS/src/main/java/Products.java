import asg.cliche.Command;
import asg.cliche.Param;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Products extends PEnter {

    private List<Products> productsList = new ArrayList<>(); // создает динамический массив

    @Command (description = "Command create - create a record of a product")
    public void create(@Param(name="*Name of the product", description = "Obligatory field") String name,
                       @Param(name="*Price of the product in EURO", description= "Obligatory field") BigDecimal price,
                       @Param(name="*Category of the product", description = "Please enter category of the product") int value,
                       @Param(name="Discount of the product", description = "Enter product discount if available") BigDecimal discount,
                       @Param(name="Description of the product", description = "Please enter description of the product") String description)
                        {
        Products r = new Products();
        r.setName(name);
        r.setPrice(price);
        r.setDiscount(discount);
        r.setDescription(description);
        r.getEventStatusByValue(value);
        productsList.add(r);
    }

    @Command (description = "")
    public List<Products> list() {
        return productsList;
    }




}
package lt.techin.parduotuve;

import lt.techin.parduotuve.product.Product;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPriceWithTax()<o2.getPriceWithTax())
            return -1;
        else if(o1.getPriceWithTax()<o2.getPriceWithTax())
            return 1;
        return 0;
    }
}

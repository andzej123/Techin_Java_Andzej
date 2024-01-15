package lt.techin.parduotuve;

import lt.techin.parduotuve.product.Product;

import java.util.Comparator;

public class SortByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

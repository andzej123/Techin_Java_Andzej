package lt.techin.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyWarehouse implements Warehouse {

    private List<Product> listOfProducts = new ArrayList<>();

    @Override
    public void addProducts(List<Product> products) {
        listOfProducts.addAll(products);
    }

    @Override
    public int getNumberOfProducts() {
        return listOfProducts.size();
    }

    @Override
    public List<Product> executeFilteringStrategy(FilteringStrategy strategy) {
//        List<Product> result = new ArrayList<>();
//        for (Product p : listOfProducts) {
//            if (strategy.filter(p)) {
//                result.add(p);
//            }
//        }
//        return result;
        return listOfProducts.stream().filter(strategy::filter).collect(Collectors.toList());
    }
}

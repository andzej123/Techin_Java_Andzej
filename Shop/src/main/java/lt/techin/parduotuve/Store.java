package lt.techin.parduotuve;

import lt.techin.parduotuve.product.Product;

import java.util.ArrayList;

public class Store {

    private String name;
    private ArrayList<Product> listOfProducts;

    public Store(String name) {
        this.name = name;
        listOfProducts = new ArrayList<>();
    }

    public void add(Product product) {
        listOfProducts.add(product);
    }

    public String getName() {
        return name;
    }

    public void printProducts() {
        System.out.println(name + ":");
        for (Product p : listOfProducts) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "====>>>> " + name + " <<<<====";
    }
}

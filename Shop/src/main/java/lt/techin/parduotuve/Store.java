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

    public void printPricesConvertedToLitai() {
        for (Product p : listOfProducts) {
//            System.out.println("Price EUR: " + p.getPriceWithTax() + "  Price LT: " + p.getPriceWithTax() / 3.45);
            System.out.printf("Name: %15s   Price EUR: %6.2f   Price LT: %6.2f \n", p.getName(), p.getPriceWithTax(), p.getPriceWithTax() * 3.45);
        }
    }

    public void printSortedByName() {
        ArrayList<Product> result = new ArrayList<>(listOfProducts);
        result.sort(new SortByName());
        for (Product p : result) {
            System.out.println(p);
        }
    }

    public void printSortedByPrice() {
        ArrayList<Product> result = new ArrayList<>(listOfProducts);
        result.sort(new SortByPrice());
        for (Product p : result) {
            System.out.println(p);
        }
    }

    public Product searchByName(String s) {
        for (Product p : listOfProducts) {
            if (p.getName().toLowerCase().equals(s.toLowerCase())) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "====>>>> " + name + " <<<<====";
    }
}

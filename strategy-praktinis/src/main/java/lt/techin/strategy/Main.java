package lt.techin.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product phone = new Product("Phone", 100, "Samsung");
        Product watch = new Product("Watch", 150, "Apple");
        Product camera = new Product("Camera", 70, "Xiaomi");

        List<Product> list = new ArrayList<>();
        list.add(phone);
        list.add(watch);
        list.add(camera);

        MyWarehouse wh = new MyWarehouse();
        wh.addProducts(list);
        System.out.println(wh.getNumberOfProducts());

        System.out.println(wh.executeFilteringStrategy(new FilterStrategyMaxPrice(99)));



    }
}

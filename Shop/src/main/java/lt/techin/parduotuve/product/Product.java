package lt.techin.parduotuve.product;

public abstract class Product {

    private String name;

    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public abstract double getPriceWithTax();

    public double getPrice() {
        return price;
    }

    public double getPriceConvertedToLitai() {
        return price * 3.45;
    }

    @Override
    public String toString() {
        return "{ Name = " + name + ", price = " + price + " }";
    }
}

package lt.techin.parduotuve.product;

public class Standart extends Product {

    int VAT;

    public Standart(String name, double price) {
        super(name, price);
        VAT = 21;
    }

    @Override
    public double getPriceWithTax() {
        return getPrice() + (getPrice() * (VAT / 100.0));
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Net price: " + getPrice() + ", Gross price: " + getPriceWithTax();
    }
}

package lt.techin.parduotuve.product;

public class Medication extends Product {

    int VAT;

    public Medication(String name, double price) {
        super(name, price);
        VAT = 9;
    }

    @Override
    public double getPriceWithTax() {
        return getPrice() + (getPrice() * (VAT / 100.0));
    }

    @Override
    public String toString() {
        return String.format("Name: %12s , Net price: %5.2f , Gross price: %5.2f", getName(), getPrice(), getPriceWithTax());
    }
}

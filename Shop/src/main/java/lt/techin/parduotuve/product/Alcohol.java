package lt.techin.parduotuve.product;

public class Alcohol extends Product {

    private int VAT;
    private double quantity;
    private double TAX;

    public Alcohol(String name, double price, double quantity, boolean alcoholLowerThat15Percent) {
        super(name, price);
        this.quantity = quantity;
        TAX = alcoholLowerThat15Percent ? 0.89 : 1.26;
        VAT = 21;
    }

    public double getTAX() {
        return quantity * TAX;
    }

    public int getVAT() {
        return VAT;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public double getPriceWithTax() {
        return getPrice() + getTAX() + (getPrice() * (VAT / 100.0));
    }

    @Override
    public String toString() {
        return String.format("Name: %12s , Net price: %5.2f , Gross price: %5.2f", getName(), getPrice(), getPriceWithTax());
    }
}

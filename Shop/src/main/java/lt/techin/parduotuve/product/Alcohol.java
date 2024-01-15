package lt.techin.parduotuve.product;

public class Alcohol extends Product {

    private int VAT;
    private double quantity;

    private double TAX;

    public Alcohol(String name, double price, double quantity, boolean lowAlcoholPercentage) {
        super(name, price);
        this.quantity = quantity;
        TAX = lowAlcoholPercentage ? 0.89 : 1.26;
        VAT = 21;
    }

    public double getTAX() {
        return quantity * TAX;
    }

    @Override
    public double getPriceWithTax() {
        return getPrice() + getTAX() +  (getPrice() * (VAT / 100.0));
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Net price: " + getPrice() + ", Gross price: " + getPriceWithTax();
    }
}

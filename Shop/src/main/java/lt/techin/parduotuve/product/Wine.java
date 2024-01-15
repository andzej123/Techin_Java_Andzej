package lt.techin.parduotuve.product;

public class Wine extends Alcohol {


    private double TAX;


    public Wine(String name, double price, double quantity, boolean alcoholLowerThat8andAHalfPercent) {
        super(name, price, quantity, false);
        TAX = alcoholLowerThat8andAHalfPercent ? 0.28 : 0.72;
    }

    public double getTAX() {
        return getQuantity() * TAX;
    }

    @Override
    public double getPriceWithTax() {
        return getPrice() + getTAX() + (getPrice() * (getVAT() / 100.0));
    }

    @Override
    public String toString() {
        return String.format("Name: %12s , Net price: %5.2f , Gross price: %5.2f", getName(), getPrice(), getPriceWithTax());
    }
}

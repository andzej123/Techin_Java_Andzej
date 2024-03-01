package lt.techin.strategy;

public class FilterStrategyManufacturer implements FilteringStrategy{

    private String manufacturer;

    public FilterStrategyManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean filter(Product product) {
        return product.getManufacturer().equalsIgnoreCase(manufacturer);
    }
}

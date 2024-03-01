package lt.techin.strategy;

public class FilterStrategyMaxPrice implements FilteringStrategy{

    private double maxPrice;

    public FilterStrategyMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean filter(Product product) {
        return product.getPrice()<=maxPrice;
    }
}

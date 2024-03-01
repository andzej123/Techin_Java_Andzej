package lt.techin.strategy;

public class MyTest extends BaseWarehouseTests{
    @Override
    Warehouse getWarehouse() {
        return new MyWarehouse();
    }

    @Override
    FilteringStrategy getManufacturerFilteringStrategy(String manufacturer) {
        return new FilterStrategyManufacturer(manufacturer);
    }

    @Override
    FilteringStrategy getMaxPriceFilteringStrategy(double maxPrice) {
        return new FilterStrategyMaxPrice(maxPrice);
    }
}

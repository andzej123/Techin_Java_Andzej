public class ProductWarehouseWithHistory extends ProductWarehouse {

    private final ChangeHistory ch = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        addToWarehouse(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        ch.add(getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double balance = getBalance();
        super.takeFromWarehouse(amount);
        ch.add(getBalance());
        if (balance > amount) {
            return amount;
        } else {
            return balance;
        }
    }

    public void printAnalysis() {
        System.out.println("Product:"  + getName());
        System.out.println("History:" + history());
        System.out.println("Largest amount of product: " + ch.maxValue());
        System.out.println("Smallest amount of product: " + ch.minValue());
        System.out.println("Average: " + ch.average());
    }


    public String history() {
        return ch.toString();
    }


}

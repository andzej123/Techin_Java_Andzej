package farmsimulator;

public class BulkTank {
    private double capacity;

    private double volume = 0;

    public BulkTank() {
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double howMuchFreeSpace() {
        return capacity-volume;
    }

    public void addToTank(double amount) {
        if (amount <= howMuchFreeSpace()) {
            volume += amount;
        } else {
            volume  = capacity;
        }

    }

    public double getFromTank(double amount) {
        if (amount <= volume) {
            volume -= amount;
            return amount;
        } else {
            double num = volume;
            volume = 0;
            return num;
        }

    }

    @Override
    public String toString() {
        double a = Math.ceil(volume);
        double b = Math.ceil(capacity);
        return String.format("%.1f/%.1f", a,b);
    }
}

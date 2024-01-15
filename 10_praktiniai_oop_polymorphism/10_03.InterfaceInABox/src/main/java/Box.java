import java.util.ArrayList;

public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> box;

    public Box(double capacity) {
        this.capacity = capacity;
        box = new ArrayList<>();
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
        box.add(item);
        }
    }

    @Override
    public double weight() {
        double sum = 0;
        for (Packable i : box) {
            sum += i.weight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
}

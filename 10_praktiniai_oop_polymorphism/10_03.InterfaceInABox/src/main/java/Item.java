public class Item implements Packable {
    private String name;
    private double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}

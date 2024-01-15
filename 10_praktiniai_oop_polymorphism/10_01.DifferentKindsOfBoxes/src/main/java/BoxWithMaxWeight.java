import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;

    private ArrayList<Item> box;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        box = new ArrayList<>();
    }

    public int countTotalWeight() {
        int sum = 0;
        for (Item i : box) {
            sum += i.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + countTotalWeight() <= capacity) {
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return box.contains(item);
    }
}

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int result = 0;
        for (Item i : items) {
            result += i.getWeight();
        }
        return result;
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public Item heaviestItem() {
        Item item = null;
        int heaviestItemWeight = Integer.MIN_VALUE;
        for (Item i : items) {
            if (item == null || i.getWeight() > heaviestItemWeight) {
                item = i;
                heaviestItemWeight = i.getWeight();
            }
        }
        return item;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else {
            String s = items.size() > 1 ? "items" : "item";
            return items.size() + " " + s + " (" + totalWeight() + " kg)";
        }
    }
}

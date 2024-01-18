import java.util.ArrayList;
import java.util.Comparator;

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
//        for (Item i : items) {
//            result += i.getWeight();
//        }
//        return result;
        return items.stream().mapToInt(Item::getWeight).sum();
    }

    public void printItems() {
//        for (Item i : items) {
//            System.out.println(i);
//        }
        items.forEach(System.out::println);
    }

    public Item heaviestItem() {
        Item item = null;
        int heaviestItemWeight = Integer.MIN_VALUE;
//        for (Item i : items) {
//            if (item == null || i.getWeight() > heaviestItemWeight) {
//                item = i;
//                heaviestItemWeight = i.getWeight();
//            }
//        }
//        return item;
        return items.stream().max(Comparator.comparingInt(Item::getWeight)).orElse(null);
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

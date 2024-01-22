package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class MaxWeightBox extends Box {

    private Collection<Thing> things = new ArrayList<>();

    private int maxWeight;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if (getTotalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    public int getTotalWeight() {
        return things.stream().mapToInt(Thing::getWeight).sum();
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (things.contains(thing)) return true;
        return false;
    }
}

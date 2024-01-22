package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class OneThingBox extends Box{

    private Collection<Thing> oneThingBox = new ArrayList<>();

    public OneThingBox() {
    }

    @Override
    public void add(Thing thing) {
        if (oneThingBox.isEmpty()) {
            oneThingBox.add(thing);
        }

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (oneThingBox.contains(thing)) return true;
        return false;
    }
}

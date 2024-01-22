package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class BlackHoleBox extends Box{

    private Collection<Thing> blackBox = new ArrayList<>();

    public BlackHoleBox() {
    }

    @Override
    public void add(Thing thing) {
        blackBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}

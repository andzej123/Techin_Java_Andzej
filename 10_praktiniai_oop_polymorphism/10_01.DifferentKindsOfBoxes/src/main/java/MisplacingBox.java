import java.util.ArrayList;

public class MisplacingBox extends Box{

    private ArrayList<Item> misplacingBox;

    public MisplacingBox() {
        misplacingBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        misplacingBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

    public void printBox() {
        for (Item i : misplacingBox) {
            System.out.println(i.getName());
        }
    }


}

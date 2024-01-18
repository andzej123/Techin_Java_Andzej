import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight() <= maximumWeight) {
            hold.add(suitcase);
        }
    }

    public void printItems() {
//        for (Suitcase h : hold) {
//            h.printItems();
//        }
        hold.forEach(Suitcase::printItems);
    }

    public int totalWeight() {
//        int result = 0;
//        for (Suitcase i : hold) {
//            result += i.totalWeight();
//        }
//        return result;
        return hold.stream().mapToInt(Suitcase::totalWeight).sum();
    }

    @Override
    public String toString() {
        return hold.size() + " suitcases (" + totalWeight() + " kg)";
    }
}

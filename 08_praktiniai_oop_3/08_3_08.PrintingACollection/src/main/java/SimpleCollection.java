
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String s = elements.isEmpty() ? "is empty." : elements.size() > 1 ?
                "has " + elements.size() + " elements:" : "has " + elements.size() + " element:";
        StringBuilder result = new StringBuilder("The collection " + name + " " + s);
        for (String e : elements) {
            result.append("\n").append(e);
        }
        return result.toString();
    }
}

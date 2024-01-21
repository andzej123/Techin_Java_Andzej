import java.util.ArrayList;
import java.util.List;

public class Changer {

    private List<Change> changes = new ArrayList<>();
    public Changer() {
    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {
        String s = characterString;
        for (Change c : changes) {
            s = c.change(s);
            System.out.println(s);
        }
        return s;
    }
}

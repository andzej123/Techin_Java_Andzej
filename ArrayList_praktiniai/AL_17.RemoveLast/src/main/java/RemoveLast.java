
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        System.out.println(strings);
        removeLast(strings);
        removeLast(strings);
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);

    }

    public static void removeLast(ArrayList<String> arr) {
        if (!arr.isEmpty()) {
            arr.remove(arr.size() - 1);
        }
    }


}

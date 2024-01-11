
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<People> list = new ArrayList<>();

        while (true) {
            System.out.println("Identifier?(empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            People people = new People(identifier, name);
            if (!list.contains(people)) {
                list.add(people);
            }

        }
        for (People l : list) {
            System.out.println(l.getIdentifier() + ": " + l.getName());
        }

    }
}

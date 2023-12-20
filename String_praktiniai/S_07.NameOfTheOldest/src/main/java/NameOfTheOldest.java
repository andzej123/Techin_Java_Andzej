
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> people = new ArrayList<>();
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            people.add(userInput);
        }

        int oldest = 0;
        String name = "";
        for (int i = 0; i < people.size(); i++) {
            String[] str = people.get(i).split(",");
            if (Integer.parseInt(str[1]) > oldest) {
                oldest = Integer.parseInt(str[1]);
                name = str[0];
            }
        }
        System.out.printf("Name of the oldest: %s", name);


    }
}

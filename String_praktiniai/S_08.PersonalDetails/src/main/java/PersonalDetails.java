
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

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

        double sum = 0;
        String name = "";
        for (String person : people) {
            String[] str = person.split(",");
            sum += Integer.parseInt(str[1]);
            if (str[0].length() > name.length()) {
                name = str[0];
            }
        }
        System.out.printf("Longest name: %s\n", name);
        System.out.printf("Average of the birth years: %.1f", sum/people.size());
    }
}

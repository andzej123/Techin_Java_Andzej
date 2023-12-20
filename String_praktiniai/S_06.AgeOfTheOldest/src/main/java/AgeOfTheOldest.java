
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

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
        for (String p : people) {
            String[] str = p.split(",");
            if (Integer.parseInt(str[1]) > oldest) {
                oldest = Integer.parseInt(str[1]);
            }
        }
        System.out.printf("Age of the oldest: %d", oldest);


    }
}

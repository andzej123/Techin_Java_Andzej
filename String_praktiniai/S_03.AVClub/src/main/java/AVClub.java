
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] array = userInput.split(" ");
            for (String n : array) {
                if (n.contains("av")) {
                    System.out.println(n);
                }
            }
        }


    }
}

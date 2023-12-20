
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] array = userInput.split(" ");
            System.out.println(array[0]);
        }


    }
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] array = userInput.split(" ");
            System.out.println(array[array.length - 1]);
        }


    }
}

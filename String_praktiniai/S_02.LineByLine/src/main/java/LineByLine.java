
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            String[] array = userInput.split(" ");
            for (String n: array) {
                System.out.println(n);
            }
        }


    }
}

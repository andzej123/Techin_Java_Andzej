
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int userInput = Integer.parseInt(scanner.nextLine());
        System.out.println("You gave the number " + userInput);

    }
}

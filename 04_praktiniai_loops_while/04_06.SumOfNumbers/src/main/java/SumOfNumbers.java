
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = 0;

        while (1 > 0) {
            System.out.println("Give a number:");
            int userInput = Integer.parseInt(scanner.nextLine());
            if (userInput == 0) {
                break;
            }
            answer += userInput;
        }
        System.out.println("Sum of the numbers: " + answer);

    }
}

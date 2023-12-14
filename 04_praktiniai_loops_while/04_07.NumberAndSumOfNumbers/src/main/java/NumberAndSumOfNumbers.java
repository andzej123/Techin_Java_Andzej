
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answerSum = 0;
        int answerCount = 0;


        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.parseInt(scanner.nextLine());
            if (userInput == 0) {
                break;
            }
            answerCount++;
            answerSum += userInput;

        }
        System.out.println("Number of numbers: " + answerCount);
        System.out.println("Sum of the numbers: " + answerSum);
    }
}

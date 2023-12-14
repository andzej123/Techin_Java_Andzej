
import java.sql.SQLOutput;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Give numbers:");
        while (true) {
            int userInput = Integer.parseInt(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
            sum += userInput;
            count++;
            if (userInput % 2 == 0 ) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        average = (double) sum / count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even " + evenCount);
        System.out.println("Odd " + oddCount);

    }
}

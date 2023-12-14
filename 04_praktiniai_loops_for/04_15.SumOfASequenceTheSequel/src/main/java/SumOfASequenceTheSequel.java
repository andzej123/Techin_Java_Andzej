
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("First number?");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");
        int lastNum = Integer.parseInt(scanner.nextLine());

        for (int i  = firstNum; i <= lastNum; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);

    }
}

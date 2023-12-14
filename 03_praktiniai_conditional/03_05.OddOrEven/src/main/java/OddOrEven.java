
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int userInput = Integer.valueOf(scan.nextLine());

        if (userInput % 2 == 0) {
            System.out.println("Number " + userInput + " is even.");
        } else {
            System.out.println("Number " + userInput + " is odd.");
        }
    }
}

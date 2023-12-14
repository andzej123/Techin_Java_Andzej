
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (1 == 1) {
            System.out.println("Give a number:");
            int numberInput = Integer.parseInt(scanner.nextLine());

            if (numberInput < 0) {
                System.out.println("Unsuitable number");
            } else if (numberInput > 0 ) {
                System.out.println(numberInput * numberInput);
            } else {
                break;
            }
        }

    }
}

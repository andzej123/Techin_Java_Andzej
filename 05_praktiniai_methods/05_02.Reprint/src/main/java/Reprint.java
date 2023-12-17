
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int userInput = Integer.parseInt(scanner.nextLine());
        while (userInput > 0) {
            printText();
            userInput--;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");

    }
}

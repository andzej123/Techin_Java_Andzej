import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double average = 0;
        int count = 0;

        while (1 > 0) {
            System.out.println("Give a number:");
            double userInput = Double.parseDouble(scanner.nextLine());
            if (userInput == 0) {
                break;
            }
            if (userInput > 0) {
                sum += userInput;
                count++;
            }

        }
        average = sum / count;
        System.out.println(count == 0 ? "Cannot calculate the average" : "Average of the numbers: " + average);

    }
}

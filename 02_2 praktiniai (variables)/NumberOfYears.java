import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        int minutesInput = scanner.nextInt();

        int numOfDays = minutesInput / 60 / 24;


        int resultYears = numOfDays / 365;
        int resultDays = numOfDays % 365;
        System.out.println(minutesInput + " minutes is approximately " + resultYears + " years and " + resultDays + " days");

    }
}

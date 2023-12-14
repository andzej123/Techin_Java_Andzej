import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MileToKilometer {

    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");
        double numMiles = scanner.nextDouble();

        double result = numMiles * 1.6;

        System.out.println(numMiles + " miles is " + decfor.format(result) + " kilometers");

    }
}

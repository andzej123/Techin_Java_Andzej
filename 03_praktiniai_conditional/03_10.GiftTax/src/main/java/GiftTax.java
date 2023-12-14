
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tax = 0;

        System.out.println("Value of the gift?");
        int giftPrice = Integer.parseInt(scan.nextLine());


        if (giftPrice < 5000) {
            System.out.println("No tax!");
        } else if (giftPrice < 25000) {
            tax = 100 + (giftPrice - 5000) * 0.08;
            System.out.println("Tax: " + tax);
        } else if (giftPrice < 55000) {
            tax = 1700 + (giftPrice - 25000) * 0.10;
            System.out.println("Tax: " + tax);
        } else if (giftPrice < 200000) {
            tax = 4700 + (giftPrice - 55000) * 0.12;
            System.out.println("Tax: " + tax);
        } else if (giftPrice < 1000000) {
            tax = 22100 + (giftPrice - 200000) * 0.15;
            System.out.println("Tax: " + tax);
        } else {
            tax = 142100 + (giftPrice - 1000000) * 0.17;
            System.out.println(tax);
        }

    }
}

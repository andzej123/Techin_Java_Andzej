import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int yearInput = Integer.parseInt(scan.nextLine());

//        if (yearInput % 4 == 0) {
//            if (yearInput % 100 == 0 && yearInput % 400 == 0) {
//                System.out.println("This year is a leap year.");
//            } else if (yearInput % 100 == 0 && yearInput % 400 != 0) {
//                System.out.println("This year is not a leap year.");
//            } else {
//                System.out.println("This year is a leap year.");
//            }
//        } else {
//            System.out.println("This year is not a leap year.");
//        }

//        if ((yearInput % 4 == 0 && yearInput % 100 != 0) || (yearInput % 4 == 0 && yearInput % 100 == 0 && yearInput % 400 == 0)) {
//            System.out.println("This year is a leap year.");
//        } else {
//            System.out.println("This year is not a leap year.");
//        }

        if ((yearInput % 4 == 0 && yearInput % 100 != 0) || yearInput % 400 == 0) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }

    }
}

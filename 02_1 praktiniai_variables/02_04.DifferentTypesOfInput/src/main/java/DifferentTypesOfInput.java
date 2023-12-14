
import java.sql.SQLOutput;
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String userString = scan.nextLine();
        System.out.println("Give an integer:");
        int userInt = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        double userDouble = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean userBoolean = Boolean.valueOf(scan.nextLine());


        System.out.println("You gave the string " + userString);
        System.out.println("You gave the integer " + userInt);
        System.out.println("You gave the double " + userDouble);
        System.out.println("You gave the boolean " + userBoolean);

    }
}

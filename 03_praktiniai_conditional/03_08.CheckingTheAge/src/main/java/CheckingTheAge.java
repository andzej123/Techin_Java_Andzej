
import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int ageInput = Integer.valueOf(scan.nextLine());

        System.out.println(ageInput >= 0 && ageInput <= 120 ? "OK" : "Impossible!");

    }
}

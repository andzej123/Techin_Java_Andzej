
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        ArrayList<PersonalInformation> list = new ArrayList<>();

        while (true) {
            System.out.println("First name: ");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) break;
            System.out.println("Last name: ");
            String inputLastName = scanner.nextLine();
            System.out.println("Identification number: ");
            String inputID = scanner.nextLine();
            list.add(new PersonalInformation(inputName, inputLastName, inputID));
        }
        for (PersonalInformation l : list) {
            System.out.println(l.getFirstName() + " " + l.getLastName());
        }

    }
}

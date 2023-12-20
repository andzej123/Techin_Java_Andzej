
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> logins = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        logins. add("alex");
        logins. add("emma");
        passwords.add("sunshine");
        passwords.add("haskell");

        System.out.print("Enter username: ");
        String loginInput = scanner.nextLine();
        System.out.print("Enter password: ");
        String passwordInput = scanner.nextLine();

        if (logins.contains(loginInput) && passwordInput.equals(passwords.get(logins.indexOf(loginInput)))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}

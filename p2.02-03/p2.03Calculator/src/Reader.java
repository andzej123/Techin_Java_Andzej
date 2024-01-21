import java.util.Scanner;

public class Reader {

    private final Scanner scan = new Scanner(System.in);
    public String readString() {
        return scan.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(scan.nextLine());
    }
}

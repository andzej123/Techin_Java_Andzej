import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        ArrayList<TelevisionProgram> list = new ArrayList<>();

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;
            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());
            list.add(new TelevisionProgram(name, duration));
        }
        System.out.println("Program,s maximum duration?");
        int length = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram l : list) {
            int d = l.getDuration();
            if (d <= length) {
                System.out.println(l.getName() + ", " + d);
            }
        }

    }
}

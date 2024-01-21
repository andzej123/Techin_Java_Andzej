
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        BirdsDatabase database = new BirdsDatabase();

        while(true) {
            System.out.print("? ");
            String s = scan.nextLine();
            if (s.equalsIgnoreCase("add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                database.add(new Bird(name, latinName));
            } else if (s.equalsIgnoreCase("observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                database.hasBird(birdName);
            } else if (s.equalsIgnoreCase("quit")) {
                break;
            }else if (s.equalsIgnoreCase("all")) {
                database.printBirds();
            } else if (s.equalsIgnoreCase("one")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                database.printBird(birdName);
            } else {
                System.out.println("No such command");
            }
        }
        database.printBirds();

    }

}

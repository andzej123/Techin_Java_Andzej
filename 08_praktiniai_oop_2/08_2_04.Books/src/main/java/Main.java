import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> list = new ArrayList<>();

        while(true) {
            System.out.println("Title: ");
            String title = scan.nextLine();
            if (title.isEmpty()) break;
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scan.nextLine());
            System.out.println("Publicaton year: ");
            int publicationYear = Integer.parseInt(scan.nextLine());
            list.add(new Book(title, pages, publicationYear));
        }

        System.out.println("What information will be printed?");
        String userInput = scan.nextLine();
        for (Book b : list) {
            if (userInput.equals("everything")) {
                System.out.println(b.getTitle() + ", " + b.getPages() + " pages, " + b.getPublicationYear());
            } else if (userInput.equals("name")) {
                System.out.println(b.getTitle());
            }
        }


    }
}

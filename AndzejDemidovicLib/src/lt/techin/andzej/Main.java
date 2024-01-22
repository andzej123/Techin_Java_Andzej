package lt.techin.andzej;

import lt.techin.library.Author;
import lt.techin.library.Book;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Author> authors1 = new ArrayList<>();
        List<Author> authors2 = new ArrayList<>();
        Author author1 = new Author("Author1", 2000);
        Author author2 = new Author("Author2", 2001);
        Author author3 = new Author("Author3", 2002);
        authors1.add(author1);
        authors1.add(author2);
        authors1.add(author3);
        authors2.add(author1);
        authors1.add(author3);


        Book book1 = new Book("title1", authors1, "isbn1", 1991, "publisher1", 25, new BigDecimal(20), false);
        Book book2 = new Book("title2", authors2, "isbn2", 2015, "publisher1", 26, new BigDecimal(22), false);
        Book book3 = new Book("title3", authors1, "isbn3", 2010, "publisher2", 27, new BigDecimal(22), false);

        MyBookCatalog my = new MyBookCatalog();
        my.addBook(book1);
        my.addBook(book2);
        my.addBook(book3);

        my.printBooksAvailibility();


    }
}

package lt.techin.andzej;

import lt.techin.library.Author;
import lt.techin.library.Book;
import lt.techin.library.BookCatalog;
import lt.techin.library.BookNotFoundException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyBookCatalog implements BookCatalog {

    private List<Book> booksCatalog = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book == null");
        }
        if (book.getIsbn() == null || book.getTitle() == null || book.getIsbn().isEmpty() || book.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Book ISBN or book title == null ir isEmpty");
        }
        if (!booksCatalog.contains(book)) {
            booksCatalog.add(book);
        }
    }

    @Override
    public Book getBookByIsbn(String s) {
        return booksCatalog.stream().filter(book -> book.getIsbn().contains(s)).findFirst().orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    @Override
    public List<Book> searchBooksByAuthor(String s) {
        List<Book> answer = new ArrayList<>();
        for (Book b : booksCatalog) {
            for (Author a : b.getAuthors()) {
                if (a.getName().equals(s)) {
                    answer.add(b);
                }
            }
        }
        return answer;
//        return booksCatalog.stream().filter(book -> book.getAuthors().equals(s)).collect(Collectors.toList());
    }

    @Override
    public int getTotalNumberOfBooks() {
        return booksCatalog.size();
    }

    @Override
    public boolean isBookInCatalog(String s) {
        return booksCatalog.stream().anyMatch(book -> book.getIsbn().equals(s));
    }

    @Override
    public boolean isBookAvailable(String s) {
        if (isBookInCatalog(s)) {
            return getBookByIsbn(s).isAvailable();
        }
        return false;
    }

    @Override
    public Book findNewestBookByPublisher(String s) {
        return booksCatalog.stream().filter(book -> book.getPublisher().equals(s)).max((o1, o2) -> o1.getPublicationYear() - o2.getPublicationYear()).orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    @Override
    public List<Book> getSortedBooks() {
        return booksCatalog.stream().sorted(Comparator.comparing(Book::getPublicationYear).thenComparing(Book::getTitle).thenComparing(Book::getPageCount)).collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Book>> groupBooksByPublisher() {
        return booksCatalog.stream().collect(Collectors.groupingBy(Book::getPublisher));
    }

    @Override
    public List<Book> filterBooks(Predicate<Book> predicate) {
        return booksCatalog.stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return booksCatalog.stream().map(Book::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal calculateApproxAveragePrice() {
        BigDecimal sum = booksCatalog.stream()
                .map(Book::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return sum.divide(new BigDecimal(booksCatalog.size()), RoundingMode.HALF_EVEN);
    }

    public Map<Boolean, Map<Boolean, Long>> countBooksAvailibility() {
        return booksCatalog.stream().collect(Collectors.partitioningBy(Book::isAvailable, Collectors.groupingBy(Book::isAvailable, Collectors.counting())));
    }
}

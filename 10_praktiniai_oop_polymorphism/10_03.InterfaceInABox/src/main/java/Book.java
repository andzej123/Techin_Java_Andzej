public class Book extends Item implements Packable {

    private String author;

    public Book(String author, String name, double weight) {
        super(name, weight);
        this.author = author;
    }

    @Override
    public double weight() {
        return super.weight();
    }

    @Override
    public String toString() {
        return author + ": " + getName();
    }
}

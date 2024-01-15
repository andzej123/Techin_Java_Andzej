public class CD extends Item implements Packable {

    private String artist;
    private int publicationYear;

    public CD(String artist, String name, int publicationYear) {
        super(name, 0.1);
        this.artist = artist;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return super.weight();
    }

    @Override
    public String toString() {
        return artist + ": " + getName() + " (" + publicationYear + ")";
    }
}

import java.util.Objects;

public class People {
    private String identifier;
    private String name;

    public People(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(identifier, people.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }
}

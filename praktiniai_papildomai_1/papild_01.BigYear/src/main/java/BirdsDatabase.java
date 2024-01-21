import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BirdsDatabase {
    private List<Bird> birdsDatabase;

    public BirdsDatabase() {
        birdsDatabase = new ArrayList<>();
    }

    public void add(Bird bird) {
        birdsDatabase.add(bird);
    }

    public void printBird(String name) {
        Optional<Bird> bird = birdsDatabase.stream()
                .filter(b -> b.getName().equalsIgnoreCase(name))
                .findFirst();

        if (bird.isPresent()) {
            System.out.println(bird);
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void hasBird(String name) {
        Optional<Bird> bird = birdsDatabase.stream()
                .filter(b -> b.getName().equalsIgnoreCase(name))
                .findFirst();

        if (bird.isPresent()) {
            bird.get().setObservationCount();
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void printBirds() {
        birdsDatabase.forEach(System.out::println);
    }
}

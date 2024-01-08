package lt.techin.oop;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("yellow", 5, false);
        Animal dog = new Dog();
        Animal bird = new Bird();
        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}

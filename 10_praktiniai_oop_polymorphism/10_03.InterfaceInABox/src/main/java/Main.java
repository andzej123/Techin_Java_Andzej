
public class Main {

    public static void main(String[] args) {
        // test your classes here

        Box box = new Box(10);
        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.5));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being here", 2012));

        Box box2 = new Box(10);
        box2.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box2.add(new Book("Robert Martin", "Clean Code", 1));
        box2.add(new Book("Kent Beck", "Test Driven Development", 0.5));

        box2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box2.add(new CD("Rendezvous Park", "Closer to Being here", 2012));

//        System.out.println(box);
//        System.out.println(box2);

        Box box3 = new Box(100);
        box3.add(box);
        box3.add(box2);
        System.out.println(box3);

    }

}

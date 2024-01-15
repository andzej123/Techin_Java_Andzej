import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        ArrayList<Person> persons = new ArrayList<>();
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        persons.add(ada);
        persons.add(esko);
        persons.add(ollie);
        printPersons(persons);



    }

    public static void printPersons(ArrayList<Person> persons) {
        for(Person p : persons) {
            System.out.println(p);
        }

    }

}

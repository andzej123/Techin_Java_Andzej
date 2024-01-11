import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;

    public Room() {
        list = new ArrayList<>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return list;
    }

    public Person shortest() {
        Person p = null;
        int smallest = Integer.MAX_VALUE;
        for (Person per : list) {
            if (p == null || per.getHeight() < smallest) {
                p = per;
                smallest = per.getHeight();
            }
        }
        return p;
    }

    public Person take() {
        Person p = shortest();
        if (list.isEmpty()) {
            return null;
        } else {
            list.remove(p);
            return p;
        }
    }
}

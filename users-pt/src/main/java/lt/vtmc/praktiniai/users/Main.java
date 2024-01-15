package lt.vtmc.praktiniai.users;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User jonas = new User("Jonas", 25, true);
        User petras = new User("Petras", 34, true);
        User rasa = new User("Rasa", 27, false);
        User jurgita = new User("Jurgita", 39, false);
        User adele = new User("Adele", 19, false);

        List<User> users = new ArrayList<>();
        users.add(jonas);
        users.add(petras);
        users.add(rasa);
        users.add(jurgita);
        users.add(adele);

        System.out.println(Praktiniai.countUsersOlderThen25(users));
        System.out.println(Praktiniai.sumAge(users));
        System.out.println(Praktiniai.getAverageAge(users));
        System.out.println(Praktiniai.getMinAge(users));
        System.out.println(Praktiniai.sortByAge(users));
        System.out.println(Praktiniai.findOldest(users));
        System.out.println(Praktiniai.findByName(users, "Jonas"));

    }
}

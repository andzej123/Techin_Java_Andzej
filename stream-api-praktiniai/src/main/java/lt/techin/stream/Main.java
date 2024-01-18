package lt.techin.stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User tomas = new User("Tomas", 25, true);
        User petras = new User("Petras", 27, true);
        User kazys = new User("Kazys", 35, true);
        List<User> users = new ArrayList<>();
        users.add(tomas);
        users.add(petras);
        users.add(kazys);
        System.out.println( StreamPraktiniai.generateFirst10PrimeNumbers());


    }
}

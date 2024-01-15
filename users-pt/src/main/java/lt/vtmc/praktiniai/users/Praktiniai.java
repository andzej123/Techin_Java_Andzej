package lt.vtmc.praktiniai.users;

import java.util.Collections;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        Integer count = 0;
        for (User u : users) {
            if (u.getAge() > 25) {
                count++;
            }
        }
        return count;
    }

    public static double getAverageAge(List<User> users) {
        return (double) sumAge(users) / users.size();
    }

    public static Integer getMinAge(List<User> users) {
        return Collections.min(users).getAge();
    }


    public static User findByName(List<User> users, String name) {
        for (User u : users) {
            if (u.getName().equals(name)) {
                return u;
            }
        }
        return null;
    }

    public static List<User> sortByAge(List<User> users) {

//        Collections.sort(users);
        users.sort(new UserAgeComparator());
        return users;
    }

    public static User findOldest(List<User> users) {
        return Collections.max(users);
    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for (User u : users) {
            sum += u.getAge();
        }
        return sum;
    }
}

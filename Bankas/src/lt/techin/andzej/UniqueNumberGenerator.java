package lt.techin.andzej;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniqueNumberGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LENGTH = 10;
    private static List<String> list = new ArrayList<>();

    public static String generateUniqueNumber() {
        while (true) {
            String number = getNumber();
            if (!checkForDuplicate(number)) {
                list.add(number);
                return number;
            }
        }
    }

    private static String getNumber() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

    private static boolean checkForDuplicate(String s) {
        return list.contains(s);
    }

}

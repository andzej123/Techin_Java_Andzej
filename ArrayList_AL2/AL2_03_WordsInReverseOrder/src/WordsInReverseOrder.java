import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            String word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            }
            words.add(word);
        }
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(words.size() - 1 - i));
        }
    }
}

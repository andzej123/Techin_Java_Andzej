import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while(true) {
            String word = reader.nextLine();
            words.add(word);
            if (word.isEmpty()) {
                for (int i = 0; i < words.size(); i++) {
                    System.out.println(words.get(i));
                }
                break;
            }
        }


    }
}

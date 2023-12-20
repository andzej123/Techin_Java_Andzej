import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = "octopulus";
        String hiddenWord1 = "";
        for (int i = 0; i < word1.length(); i++) {
            hiddenWord1 += "*";
        }
        char[] word = word1.toCharArray();
        char[] hiddenWord = hiddenWord1.toCharArray();
        ArrayList<String> usedLetters = new ArrayList<>();

        System.out.println(hiddenWord);
        while(checkForNextTurn(hiddenWord)) {
            System.out.println("Enter a letter:");
            String userInput = scan.nextLine();
            while (checkForDuplicate(usedLetters, userInput)) {
                System.out.println("This already exists");
                System.out.println("Enter a letter:");
                userInput = scan.nextLine();
            }

            checkForLetter(word, hiddenWord, userInput);

            System.out.println(hiddenWord);
        }
    }

    public static void checkForLetter(char[] original, char[] hidden, String searchItem) {
        for (int i = 0; i < original.length; i++) {
            if (original[i] == searchItem.charAt(0)) {
                hidden[i] = searchItem.charAt(0);
            }
        }
    }

    public static boolean checkForNextTurn(char[] hidden) {
        for (char c : hidden) {
            if (c == '*') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkForDuplicate (ArrayList<String> arr , String s) {
        if (arr.contains(s)) {
            return true;
        }
        arr.add(s);
        return false;
    }
}

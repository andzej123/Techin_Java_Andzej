import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        String word1 = pickWord();
        StringBuilder hiddenWord1 = new StringBuilder();
        hiddenWord1.append("*".repeat(word1.length()));

        char[] word = word1.toCharArray();
        char[] hiddenWord = hiddenWord1.toString().toCharArray();


        System.out.println("Start new game");
        int Pete = startNewGame(hiddenWord, word, 1);
        int Steve = startNewGame(hiddenWord, word, 2);


    }

    public static int startNewGame(char[] hiddenWord, char[] word,int player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Player " + player + " begin");

        ArrayList<String> usedLetters = new ArrayList<>();
        System.out.println(hiddenWord);
        int turn = 1;
        while (checkForNextTurn(hiddenWord)) {
            System.out.println("Turn " + turn +  ". Enter a letter:");
            String userInput = scan.nextLine();

            while (checkForDuplicate(usedLetters, userInput)) {
                System.out.println("This already exists");
                System.out.println(hiddenWord);
                System.out.println("Turn " + turn +  ". Enter a letter:");
                userInput = scan.nextLine();
            }
            turn++;

            checkForLetter(word, hiddenWord, userInput);
            System.out.println(hiddenWord);
        }
        System.out.printf("It took %d turns to win.", turn);
        return turn;
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

    public static boolean checkForDuplicate(ArrayList<String> arr, String s) {
        if (arr.contains(s)) {
            return true;
        }
        arr.add(s);
        return false;
    }

    public static String pickWord() {
        String[] words = {"wellspring", "yachtsman", "zigzagging", "espionage", "bandwagon", "mnemonic", "transgress", "vaporize", "glowworm", "pizazz"};
        Random r = new Random();
        return words[r.nextInt(10)];
    }
}

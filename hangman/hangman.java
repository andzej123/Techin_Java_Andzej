import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {

        System.out.println("Start new game");

        String playerOne = "Pete";
        String playerTwo = "Steve";

        int firstPlayer = startNewGame(1);
        int secondPlayer = startNewGame(2);

        if (firstPlayer < secondPlayer) {
            System.out.println("The winner is " + playerOne);
        } else if (firstPlayer > secondPlayer) {
            System.out.println("The winner is " + playerTwo);
        } else {
            System.out.println("Omg it's a tie");
        }

    }

    public static int startNewGame(int player) {
        Scanner scan = new Scanner(System.in);

        char[] word = pickWord();
        StringBuilder hiddenWord1 = new StringBuilder();
        hiddenWord1.append("*".repeat(word.length));
        char[] hiddenWord = hiddenWord1.toString().toCharArray();

        System.out.println("Player " + player + " begin");

        ArrayList<String> usedLetters = new ArrayList<>();
        System.out.println(hiddenWord);
        int turn = 1;
        while (checkForNextTurn(hiddenWord)) {
            System.out.println("Turn " + turn + ". Enter a letter:");
            String userInput = scan.nextLine();

            while (checkForDuplicate(usedLetters, userInput)) {
                System.out.println("This already exists");
                System.out.println(hiddenWord);
                System.out.println("Turn " + turn + ". Enter a letter:");
                userInput = scan.nextLine();
            }
            turn++;

            checkForLetter(word, hiddenWord, userInput);
            System.out.println(hiddenWord);
        }
        System.out.printf("It took %d turns to pass.\n", turn);
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

    public static char[] pickWord() {
        String[] words = {"wellspring", "yachtsman", "zigzagging", "espionage", "bandwagon", "mnemonic", "transgress", "vaporize", "glowworm", "pizazz"};
        Random r = new Random();

        return words[r.nextInt(10)].toCharArray();
    }
}

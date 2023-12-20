import javax.naming.PartialResultException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {
        String[] symbols = {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "};

        drawBoard(symbols);

        startAGame(symbols);
    }

    public static void startAGame(String[] symbols) {
        Scanner scan = new Scanner(System.in);
        while (!checkForWin(symbols)) {
            for (int i = 1; i < 3; i++) {
                System.out.print("Enter a row (0, 1, 2) for player " + i + ":");
                int row = Integer.parseInt(scan.nextLine());
                System.out.print("Enter a column (0, 1, 2) for player " + i + ":");
                int column = Integer.parseInt(scan.nextLine());
                if (i == 1) {
                    symbols[checkPlace(row, column)] = " X ";
                } else {
                    symbols[checkPlace(row, column)] = " O ";
                }
                drawBoard(symbols);
                if (checkForWin(symbols)) {
                    System.out.println("WIN for player " + i);
                    break;
                }
            }
        }
    }

    public static int checkPlace(int row, int column) {
        if (row == 1) {
            return column - 1;
        } else if (row == 2) {
            return column + 2;
        } else {
            return column + 5;
        }
    }

    public static boolean checkForWin(String[] symbols) {
        for (int i = 0; i < 9; i += 3) {
            if (!symbols[i].isBlank() && symbols[i].equals(symbols[i + 1]) && symbols[i].equals(symbols[i + 2])) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!symbols[i].isBlank() && symbols[i].equals(symbols[i + 3]) && symbols[i].equals(symbols[i + 6])) {
                return true;
            }
        }
        return (!symbols[0].isBlank() && symbols[0].equals(symbols[4]) && symbols[0].equals(symbols[8])) || (!symbols[2].isBlank() && symbols[2].equals(symbols[4]) && symbols[2].equals(symbols[6]));
    }

    public static void drawLine() {
        System.out.print("-".repeat(10));
        System.out.println("-");
    }

    public static void drawBoard(String[] symbols) {
        int num = 0;
        for (int i = 1; i < 4; i++) {
            if (i == 2 || i == 3) {
                drawLine();
            }
            for (int j = 1 + num; j < 4 + num; j++) {
                System.out.print(symbols[j - 1]);
                if (j != 3 + num) {
                    System.out.print("|");
                }
            }
            System.out.println();
            num += 3;
        }
    }
}

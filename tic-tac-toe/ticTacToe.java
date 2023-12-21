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
        int turn = 1;
        while (!checkForWin(symbols) && turn != 10) {
            for (int i = 1; i < 3; i++) {
                System.out.println("Turn " + turn);
                int place = -1;
                while (true) {
                    // Take values from player 1 and player 2 and check for number validation
                    System.out.print("Enter a row (0, 1, 2) for player " + i + ":");
                    int row = Integer.parseInt(scan.nextLine());
                    while (row < 1 || row > 3) {
                        System.out.println("Enter a valid number");
                        System.out.print("Enter a row (0, 1, 2) for player " + i + ":");
                        row = Integer.parseInt(scan.nextLine());
                    }
                    System.out.print("Enter a column (0, 1, 2) for player " + i + ":");
                    int column = Integer.parseInt(scan.nextLine());
                    while (column < 1 || column > 3) {
                        System.out.println("Enter a valid number");
                        System.out.print("Enter a row (0, 1, 2) for player " + i + ":");
                        column = Integer.parseInt(scan.nextLine());
                    }
                    // Check if that field is empty and if not ask for another input
                    place = checkPlace(row, column);
                    if (checkIfPlaceIsEmpty(symbols, place)) {
                        break;
                    } else {
                        System.out.println("Place is taken");
                    }
                }

                // Check what symbol to draw on board and in which place
                if (i == 1) {
                    symbols[place] = " X ";
                } else {
                    symbols[place] = " O ";
                }

                drawBoard(symbols);
                turn++;
                if (checkForWin(symbols)) {
                    System.out.println("WIN for player " + i);
                    break;
                }
                if (turn == 10) {
                    System.out.println("End of turns");
                    break;
                }
            }
        }
    }

    public static boolean checkIfPlaceIsEmpty(String[] arr, int number) {
        return arr[number].isBlank();
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

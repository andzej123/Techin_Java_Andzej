import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {
        String[] symbols = {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   "};

        drawBoard(symbols);

        startAGame(symbols);
    }

    public static void startAGame(String[] symbols) {
        int turn = 1;
        while (!checkForWin(symbols) && turn != 10) {
            for (int i = 1; i < 3; i++) {
                System.out.println("Turn " + turn);
                int place = -1;
                while (true) {

                    int row = takeInput(i, "row");
                    int column = takeInput(i, "column");

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

    public static int takeInput(int turn, String position) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a " + position + " (1, 2, 3) for player " + turn + ":");
        String s = scan.nextLine();
        while (!s.matches("\\d+") || (!s.equals("2") && !s.equals("1") && !s.equals("3"))) {
            System.out.println("Enter a valid number");
            System.out.print("Enter a " + position + " (1, 2, 3) for player " + turn + ":");
            s = scan.nextLine();
        }
        return Integer.parseInt(s);
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

public class Nested_Loops_3 {
    public static void main(String[] args) {
        printPyramid(8);
        printTriangles(8);
        printBigPyramid(8);
    }

    public static void printBigPyramid(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size * 4 - i * 4);//here you need more spaces
            for (int j = 0; j < i; j++) {
                int x = (int) Math.pow(2, j);
                printPadding(x);
                System.out.print(x);
            }
            for (int j = i - 2; j >= 0; j--) {
                int x = (int) Math.pow(2, j);
                printPadding(x);
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public static void printPadding(int x) {
        if (x < 10) {
            System.out.print("   ");//3 spaces
        } else if (x < 99) {
            System.out.print("  ");//2 spaces
        } else {
            System.out.print(" ");
        }
    }

    public static void printTriangles(int size) {
        for (int i = 1; i <= size; i++) {
            printNumbers(i);
            printSpaces(size * 2 - i * 2 - 1);
            if (i == size) {
                printNumbersBackwards(i - 1);
            } else {
                printNumbersBackwards(i);
            }
            System.out.println();
        }
    }

    public static void printPyramid(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printNumbers(i);
            printNumbersBackwards(i - 1);
            System.out.println();
        }
    }

    public static void printNumbersBackwards(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(number - i);
        }
    }

    public static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i);
        }
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
}

public class Nested_Loops {
    public static void main(String[] args) {
        printTriangle(8);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("#");
        }
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printNumbers(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(number - i);
        }
        System.out.println();
    }

    public static void printNumbersbackwards(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(size - i + 1);
            System.out.println();
        }
        System.out.println("-------------------");
        for (int i = size; i >= 1; i--) {
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
        System.out.println("-------------------");

        for (int i = 1; i <= size; i++) {
            printNumbers(i);
        }
        System.out.println("-------------------");

        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printNumbersbackwards(i);
        }
        System.out.println("-------------------");
    }
}

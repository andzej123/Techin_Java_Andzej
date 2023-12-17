public class Nested_Loops_2 {
    public static void main(String[] args) {
        printSquare(7);
        printBackwardsZ(7);
        printOpenX(7);
        printSquareX(7);
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

    public static void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            if (i == 1 || i == size) {
                printStars(size);
            } else {
                System.out.print("#");
                printSpaces(size - 2);
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void printBackwardsZ(int size) {
        for (int i = 1; i <= size; i++) {
            if (i == 1 || i == size) {
                printStars(size);
            } else {
                printSpaces(i - 1);
                printStars(1);
            }
            System.out.println();
        }
    }

    public static void printOpenX(int size) {
//        for (int i = 1; i <= size; i++) {
//            if (i == 1 || i == size) {
//                printStars(size);
//            } else {
//                if (i < size / 2 + 1) {
//                    printSpaces(i - 1);
//                    printStars(1);
//                    printSpaces(size - i * 2);
//                    printStars(1);
//                } else if (i > size / 2 + 1) {
//                    printSpaces(size - i);
//                    printStars(1);
//                    printSpaces(-size + i * 2 - 2);
//                    printStars(1);
//                } else {
//                    printSpaces(size - i);
//                    printStars(1);
//                }
//            }
//            System.out.println();
//        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || i == j || i + j == size - 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printSquareX(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1 || i == j || i + j == size - 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

public class CountingTheOccurrences {
    public static void main(String[] args) {
        char[] array = generateHundredChars();
        printArray(array);
        System.out.println("--------------------------------------------------");
        countArray(array);
    }

    public static short countArray(char[] array) {
        char[] lettersArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        int[] arr = new int[26];
//        for (int i = 0; i < lettersArray.length; i++) {
//            int count = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (lettersArray[i] == array[j]) {
//                    count++;
//                }
//            }
//            if (i == 9 || i == 19) {
//                System.out.println(count + " " + lettersArray[i] + " ");
//            } else {
//                System.out.print(count + " " + lettersArray[i] + " ");
//            }
//        }
        int[] result = new int[26];
        for (char c : array) {
            int number = c - 97;
            result[number]++;
        }
        for (int i = 0; i < result.length; i++) {
            String s = result[i] + " " + lettersArray[i] + " ";
            if (i == 9 || i == 19) {
                System.out.println(s);
            } else {
                System.out.print(s);
            }
        }

        return 0;
    }

    public static char getRandomLowercaseLetter() {
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }

    public static char[] generateHundredChars() {
        char[] s = new char[100];
        for (int i = 0; i < 100; i++) {
            s[i] = getRandomLowercaseLetter();
        }
        return s;
    }

    public static void printArray(char[] array) {
        for (int i = 0; i < 100; i++) {
            if (i % 20 == 19) {
                System.out.println(array[i] + " ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}

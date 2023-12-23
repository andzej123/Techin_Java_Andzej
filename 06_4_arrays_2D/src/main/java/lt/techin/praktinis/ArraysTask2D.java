package lt.techin.praktinis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArraysTask2D {

    public static void main(String[] args) {
        int[][] myNumbers = {{7, 12, 3, 11}, {1, 9, 6, 16}, {2, 8, 15, 14}, {13, 5, 10, 4}};
        System.out.println("Maximum value: " + max(myNumbers));
        System.out.println("Sum value in specified row: " + rowSum(myNumbers, 2));
        System.out.println("Sum value in specified column: " + columnSum(myNumbers, 0));
        System.out.println("Sum of every row " + Arrays.toString(allRowSums(myNumbers)));
        System.out.println("This array is row magic???? " + isRowMagic(myNumbers));
        System.out.println("This array is column magic???? " + isColumnMagic(myNumbers));
        System.out.println("This array is square magic????? " + isSquare(myNumbers));
        System.out.println("This array is square magic???? " + isMagic(myNumbers));
        System.out.println("This array is latin square??? " + isLatin(myNumbers));
        System.out.println("This array is sequence??? " + isSequence(myNumbers));
    }

    /**
     * Returns the maximum value in the 2D array arr.
     *
     * @param arr The 2D array to be processed.
     * @return The maximum value in the array.
     */
    public static int max(int[][] arr) {
//        throw new UnsupportedOperationException();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        return maxValue;
    }


    /**
     * Returns the sum of the elements in Row x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The row index.
     * @return The sum of elements in the specified row.
     */
    public static int rowSum(int[][] arr, int x) {
//        throw new UnsupportedOperationException();
        int sum = 0;
        for (int i = x; i <= x; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    /**
     * Returns the sum of the elements in Column x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The column index.
     * @return The sum of elements in the specified column.
     */
    public static int columnSum(int[][] arr, int x) {

//        throw new UnsupportedOperationException();
        int sum = 0;
        for (int i = x; i <= x; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
        }
        return sum;
    }

    /**
     * Calculates the row sum for every row in arr and returns each of the values in an array.
     *
     * @param arr The 2D array to be processed.
     * @return An array containing the sum of elements in each row.
     */
    public static int[] allRowSums(int[][] arr) {

//        throw new UnsupportedOperationException();
        int[] sumValues = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sumValues[i] = sum;
        }
        return sumValues;
    }

    /**
     * Checks if the array arr is row-magic, which means that every row has the same row sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is row-magic, false otherwise.
     */
    public static boolean isRowMagic(int[][] arr) {

//        throw new UnsupportedOperationException();
        int[] sumValues = new int[arr.length];
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sumValues[i] = sum;
        }
        for (int i = 0; i < sumValues.length - 1; i++) {
            if (sumValues[i] != sumValues[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Checks if the array arr is column-magic, which means that every column has the same column sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is column-magic, false otherwise.
     */
    public static boolean isColumnMagic(int[][] arr) {

//        throw new UnsupportedOperationException();
        int[] sumValues = new int[arr.length];
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            sumValues[i] = sum;
        }
        for (int i = 0; i < sumValues.length - 1; i++) {
            if (sumValues[i] != sumValues[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Checks if the array arr is square, i.e., every row has the same length as arr itself.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is square, false otherwise.
     */
    public static boolean isSquare(int[][] arr) {
//        throw new UnsupportedOperationException();
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Checks if the array arr is a magic square, meaning it is square, and all row sums, column sums,
     * and the two diagonal-sums are equal.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a magic square, false otherwise.
     */
    public static boolean isMagic(int[][] arr) {
//        throw new UnsupportedOperationException();
        boolean result = true;
        ArrayList<Integer> sums = new ArrayList<>();
        int diagSum = 0;
        int rightDiagSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sumRow = 0;
            int sumCol = 0;

            if (arr.length != arr[i].length) {
                result = false;
                break;
            }
            for (int j = 0; j < arr[i].length; j++) {
                sumRow += arr[i][j];
                sumCol += arr[j][i];

            }
            diagSum += arr[i][i];
            rightDiagSum += arr[i][arr.length - i - 1];
            sums.add(sumRow);
            sums.add(sumCol);

        }
        sums.add(diagSum);
        sums.add(rightDiagSum);
        for (int i = 0; i < sums.size() - 1; i++) {
            if (!Objects.equals(sums.get(i), sums.get(i + 1))) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Checks to see if the array arr is a Latin square, meaning it must be square, and each row and each column
     * must contain the values 1, 2, ..., n with no repeats.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a Latin square, false otherwise.
     */
    public static boolean isLatin(int[][] arr) {
//        throw new UnsupportedOperationException();
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            int rowRes = 0;
            int sum = 0;
            if (arr.length != arr[i].length) {
                result = false;
                break;
            }
            for (int j = 0; j < arr[i].length; j++) {
                rowRes += arr.length - j;
                sum += arr[i][j];
            }
            if (rowRes != sum) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Checks to see if the array arr is square and contains each of the digits from 1 to n*n, e.g., 1, 2, ..., 16 for a 4 x 4 array.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a sequence, false otherwise.
     */
    public static boolean isSequence(int[][] arr) {
//        throw new UnsupportedOperationException();
        boolean result = true;
        int sum = 0;
        int iter = arr.length * arr[0].length;
        int arrSum = 0;
        while (iter >= 1) {
            arrSum += iter;
            iter--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                result = false;
                break;
            }
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        if (arrSum != sum) {
            result = false;
        }
        return result;
    }


}

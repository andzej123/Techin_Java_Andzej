import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
        System.out.println(Arrays.toString(values));
        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));
        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));
        System.out.println("------------SORT---------------");
        sort(values);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = Integer.MAX_VALUE;
        int indexOfSmallest = -1;
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexOfTheSmallest = -1;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

}

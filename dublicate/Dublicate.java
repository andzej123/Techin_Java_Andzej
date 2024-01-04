import java.util.HashSet;
import java.util.Set;

public class Dublicate {
    public static void main(String[] args) {

        int[] array1 = {2, 1, 3, 5, 3, 2};
        int[] array2 = {2, 2};
        int[] array3 = {2, 4, 3, 5, 1};
        System.out.println(firstDublicate(array1));
        System.out.println(firstDublicate(array2));
        System.out.println(firstDublicate(array3));

    }

    public static int firstDublicate(int[] a) {
//        int smallestDublicateIndex = 999;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j] && j < smallestDublicateIndex) {
//                    smallestDublicateIndex = j;
//                }
//            }
//        }
//        return smallestDublicateIndex != 999 ? a[smallestDublicateIndex] : -1;
        Set<Integer> set = new HashSet<>();
        int smallestIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (set.add(a[i]) == false) {
                smallestIndex = a[i];
                break;
            } else {
                set.add(a[i]);
            }
        }

        return smallestIndex;
    }
}

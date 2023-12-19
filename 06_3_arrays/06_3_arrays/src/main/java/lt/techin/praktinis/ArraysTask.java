package lt.techin.praktinis;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask {


    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 6, 5};
        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);
        System.out.println(Arrays.toString(generateRandomArray(5, 1, 10)));
        System.out.println(Arrays.toString(removeElementAndReturnNewArray(arr, 2)));
        System.out.println(Arrays.toString(insertElementAndReturnNewArray(arr, 5, 10)));
        System.out.println(Arrays.toString(reverseArray(arr)));
        reverseInPlace(arr);
        System.out.println(getAverage(arr));
    }

    public static int generateRandomNumber(int low, int high) {
        Random r = new Random();
        return r.nextInt(high + 1 - low) + low;
    }

    // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
    // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min == max ? min : generateRandomNumber(min, max);
        }
        return arr;
    }

    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {
        if (arr.length - 1 < k || k < 0) {
            return null;
        } else {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != k) {
                    newArr[j] = arr[i];
                    j++;
                }
            }
            return newArr;
        }
    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {
        if (arr.length - 1 < k) {
            return null;
        } else {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i == k) {
                    newArr[j] = x;
                    j++;
                }
                newArr[j] = arr[i];
                j++;
            }
            return newArr;
        }
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        return arr[arr.length - 1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        int result = arr[0];
        for (int i : arr) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int result = arr[0];
        for (int i : arr) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return (double) result / arr.length;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int count = 0;
        for (int i : arr) {
            if (i > n) {
                count++;
            }
        }
        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                result = i;
            }
        }
        return result;
    }


}

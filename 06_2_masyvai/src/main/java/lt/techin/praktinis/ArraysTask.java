package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        System.out.println("First array element is " + getFirstElement(arr));
        System.out.println("Last array element is " + getLastElement(arr));

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

        int maxMark = getMax(arr);
        System.out.printf("Max mark: %d\n", maxMark);

        System.out.println("Sum is " + getSum(arr));

        System.out.println("Average is: " + getAverage(arr));
        System.out.println("Number of bigger numbers than n in an array: " + countElements(arr, 4));
        System.out.println(contains(arr, 15));
        System.out.println(lastIndexOf(arr, 2));

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

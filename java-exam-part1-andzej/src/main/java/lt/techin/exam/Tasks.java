package lt.techin.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
        ArrayList<Element> list = new ArrayList<>();
        Element e1 = new Element("$10.0", true);
        Element e2 = new Element("$5.4", true);
        Element e3 = new Element("$1.2", true);
        Element e4 = new Element("$5.5", true);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        System.out.println(findSumOfPrices(list));
    }


    /* Paduotus duomenis kilometrais ir metrais konvertuoja į metrus ir rezultatą išveda į ekraną
     * pvz. kilometers = 4, meters = 67 =>
     * Atspausdina:
     * 4067 metrų
     */
    public static void convertToMeters(int kilometers, int meters) {
        System.out.println(kilometers * 1000 + meters + " metrų");
    }


    /*Kasininkė grąžą pirkėjui pabėrė centais ct. Reikia apskaičiuoti kiek tai yra eurų  ir centų .
     * pvz. 234 ct => atspausdina:
     * Gauta: 2 Eur ir 34 ct
     */
    public static void convertCentsToEuros(int cents) {
        int euros = cents / 100;
        cents = cents % 100;
        System.out.println("Gauta: " + euros + " Eur ir " + cents + " ct");
    }


    /* Raskite skaičių a, b ir c vidurkį
     */
    public static double averageOf(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }


    /* Duoti trys skaičiai. Parašykite metodą, kuris nustatytų, ar bent vienas iš jų yra lyginis.
    Pvz.:
     a = 1, b = 3, c = 5 => false
     a = 1, b = 3, c = 6 => true

    * */
    public static boolean isEven(int a, int b, int c) {
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            return true;
        }
        return false;
    }


    /*
     * Metodas parodo ar iš duotų trijų atkarpų (įvedami jų ilgiai) galima sudaryti trikampį.
     */
    public static boolean isTriangleValid(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }


    /* Metodas spausdina  nelyginius skaičius nuo pateikto skaičiaus 'number' iki 1
     * pvz. number = 8 =>
     * 7
     * 5
     * 3
     * 1
     *  */
    public static void printOddNumbers(int number) {
        for (int i = number; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    /* Paskaičiuoti kiek masyve yra skaičių didesnių nei skaičius 'number'
     * Pvz. array =  {5, 2, 4, 1} number = 3 => 2
     */
    public static int countLargerThanNumber(int[] array, int number) {
        return (int) Arrays.stream(array).filter(s -> s > number).count();
    }


    /* Surasti mažiausią skaičių ArrayListe
     * Pvz {6.7, 3.5, 8.2, 4.3} => 8.2
     */
    public static double findSmallest(ArrayList<Double> numbers) {
        Optional<Double> answer = numbers.stream().min(Double::compare);
        return answer.isPresent() ? answer.get() : -9999;
    }


    /*
     * Paskaičiuokite kiek simbolių yra String'ų List'e
     */
    public static int countLettersInList(List<String> words) {
        return words.stream().mapToInt(String::length).sum();
    }


    /* Paskaičiuoti kiek ArrayListe yra stringų, kuriuose yra žodis word
        pvz: {"iphone 12", "IPHONE 12", "samsung s23"} word = "iphone" => 2
     */
    public static int countStringsContainingWord(ArrayList<String> strings, String word) {
        return (int) strings.stream().filter(s -> s.toLowerCase().contains(word.toLowerCase())).count();
    }


    /*
     * Paskaičiuokite kiek liste elementų, kur savybė displayed yra true
     */
    public static int countDisplayedElements(List<Element> elements) {
        return (int) elements.stream().filter(Element::isDisplayed).count();
    }

    /*
     * Grąžinkite listą elementų kurių tekstas nėra tuščias arba sudarytas tik iš tarpų
     */
    public static List<Element> findElementsWithNonEmptyTexts(List<Element> elements) {
        return elements.stream().filter(s -> !s.getText().isEmpty() && !s.getText().isBlank()).collect(Collectors.toList());
    }


    /*
     * Elementų tekste užrašytos prekių kainos, pvz. "$10.52"
     * Raskite didžiausią kainą
     */
    public static double findSumOfPrices(List<Element> elements) {
//        double sum = 0;
//        for (Element e : elements) {
//            String[] arr = (e.getText().split("\\$"));
//            sum += Double.parseDouble(arr[1]);
//        }
//        return sum;
        return elements.stream().map(s -> s.getText().split("\\$")).mapToDouble(s -> Double.parseDouble(s[1])).sum();
    }
}

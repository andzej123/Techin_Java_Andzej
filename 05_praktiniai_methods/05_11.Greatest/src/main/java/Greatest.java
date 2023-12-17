
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatest = Math.max(number1, number2);
        if (greatest < number3) {
            greatest = number3;
        }
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(15, 7, 14);
        System.out.println("Greatest: " + result);
    }
}

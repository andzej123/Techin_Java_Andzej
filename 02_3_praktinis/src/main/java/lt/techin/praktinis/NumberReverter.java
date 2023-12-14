package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        int num = number;
        int result = 0;

        result = result * 10 + num % 10;
        num = num / 10;
        result = result * 10 + num % 10;
        num = num / 10;
        result = result * 10 + num % 10;

        System.out.println(result);
    }

    public static void main(String[] args) {
        NumberReverter nr = new NumberReverter();
    }
}

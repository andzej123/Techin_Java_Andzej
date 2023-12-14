package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int num = number;
        int result = 0;

        result = result + num % 10;
        num  = num / 10;
        result = result + num % 10;
        num  = num / 10;
        result = result + num % 10;
        num  = num / 10;
        result = result + num % 10;
        num  = num / 10;

        System.out.println(result);


    }

    public static void main(String[] args) {
        DigitsSumCalculator dsc = new DigitsSumCalculator();
        dsc.calculateSum(1234);
    }
}

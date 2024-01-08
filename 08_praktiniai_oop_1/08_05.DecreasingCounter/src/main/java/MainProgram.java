
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);
        DecreasingCounter counter1 = new DecreasingCounter(100);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter1.printValue();
        counter1.reset();
        counter1.printValue();

    }
}

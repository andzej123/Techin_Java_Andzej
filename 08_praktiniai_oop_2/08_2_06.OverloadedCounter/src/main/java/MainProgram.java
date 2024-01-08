
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter counter = new Counter(5);
        System.out.println(counter);
        counter.increase();
        counter.increase();
        System.out.println(counter);
        counter.decrease();
        counter.dec().dec().dec();
        System.out.println(counter);
        counter.increase(7);
        counter.decrease(2);
        System.out.println(counter);
    }
}


public class Main {

    public static void main(String[] args) {

        // Try out your class here

        Stack s = new Stack();

        s.add("Value1");
        s.add("Value2");
        s.add("Value3");
        s.add("Value4");
        s.add("Value5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }


    }
}

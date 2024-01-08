
public class MainProgram {

    public static void main(String[] args) {
        // test your class here

        Money a = new Money(10, 0);
        Money b = new Money(100, 50);

        Money c = a.minus(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

//        System.out.println(a.lessThan(a));
//        System.out.println(b.lessThan(b));
//        System.out.println(a.lessThan(c));

//        c = c.minus(a);
//
//        System.out.println(a.lessThan(a));
//        System.out.println(b.lessThan(b));
//        System.out.println(a.lessThan(c));


    }
}

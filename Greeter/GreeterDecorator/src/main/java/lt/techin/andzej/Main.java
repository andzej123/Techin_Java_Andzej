package lt.techin.andzej;

public class Main {
    public static void main(String[] args) {

        Greeter g = new GreeterImpl();
        Greeter j = new GreeterUpperCaseDecorator(g);
        Greeter h = new GreeterExclamationMarkDecorator(j);
        System.out.println(g.greet("Jonas", "Jonaitis"));
        System.out.println(j.greet("Stepas", "Stepavicius"));
        System.out.println(h.greet("Petras", "Petraitis"));

    }
}

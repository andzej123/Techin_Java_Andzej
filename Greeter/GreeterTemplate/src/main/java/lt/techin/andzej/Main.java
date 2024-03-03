package lt.techin.andzej;

public class Main {
    public static void main(String[] args) {
        Greeter lit = new LithuanianGreeter();
        lit.greet("Jonas", "Jonaitis");

        Greeter eng = new EnglishGreeter();
        eng.greet("Peter", "Johnson");

        LithuanianGreeter gret = new LithuanianGreeter();
        gret.greet("Juozas", "Juozaitis");

    }
}

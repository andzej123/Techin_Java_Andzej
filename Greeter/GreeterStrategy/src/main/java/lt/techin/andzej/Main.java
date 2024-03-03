package lt.techin.andzej;

public class Main {
    public static void main(String[] args) {

        Greeter gr = new Greeter(new EnglishGreetingStrategy(), new DotEndStrategy());
        gr.greet("Jonas", "Jonaitis");
        gr.setGreetingLanguageStrategy(new LithuanianGreetingStrategy());
        gr.greet("Jonas", "Jonaitis");
        gr.setEndSentenceStrategy(new TripleExclamationStrategy());
        gr.setGreetingLanguageStrategy(() -> "Labas rytas");
        gr.greet("Jonas", "Jonaitis");

    }
}

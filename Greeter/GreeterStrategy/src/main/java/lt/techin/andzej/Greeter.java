package lt.techin.andzej;

public class Greeter {

    private GreetingLanguageStrategy greetingLanguageStrategy;
    private GreetingLanguageStrategy endSentenceStrategy;

    public Greeter(GreetingLanguageStrategy greetingLanguageStrategy, GreetingLanguageStrategy endSentenceStrategy) {
        this.greetingLanguageStrategy = greetingLanguageStrategy;
        this.endSentenceStrategy = endSentenceStrategy;
    }

    public void setGreetingLanguageStrategy(GreetingLanguageStrategy greetingLanguageStrategy) {
        this.greetingLanguageStrategy = greetingLanguageStrategy;
    }

    public void setEndSentenceStrategy(GreetingLanguageStrategy endSentenceStrategy) {
        this.endSentenceStrategy = endSentenceStrategy;
    }

    public void greet(String firstName, String lastName) {
        System.out.println(greetingLanguageStrategy.getGreetingString() + " " + firstName + " " + lastName + endSentenceStrategy.getGreetingString());
    }
}

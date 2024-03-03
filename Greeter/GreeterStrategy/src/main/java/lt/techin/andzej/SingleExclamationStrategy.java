package lt.techin.andzej;

public class SingleExclamationStrategy implements GreetingLanguageStrategy{
    @Override
    public String getGreetingString() {
        return "!";
    }
}

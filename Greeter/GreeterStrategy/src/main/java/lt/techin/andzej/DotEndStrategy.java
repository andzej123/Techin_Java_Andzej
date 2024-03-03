package lt.techin.andzej;

public class DotEndStrategy implements GreetingLanguageStrategy{
    @Override
    public String getGreetingString() {
        return ".";
    }
}

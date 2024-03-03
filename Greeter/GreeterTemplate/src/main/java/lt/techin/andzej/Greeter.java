package lt.techin.andzej;

public abstract class Greeter {
    public void greet (String firstname, String lastName) {
        System.out.println(getGreetingString() + " " + firstname + " " + lastName);
    }

    protected abstract String getGreetingString();
}

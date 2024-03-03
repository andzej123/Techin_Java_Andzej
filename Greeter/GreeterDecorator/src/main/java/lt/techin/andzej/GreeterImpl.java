package lt.techin.andzej;

public class GreeterImpl implements Greeter{
    @Override
    public java.lang.String greet(String firstName, String lastName) {
        return "Hello " +  firstName + " " + lastName;
    }
}

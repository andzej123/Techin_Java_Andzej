package lt.techin.andzej;

public class UserNotFoundException extends Exception {



    public UserNotFoundException() {
        super("The user with this id was not found");
    }




}

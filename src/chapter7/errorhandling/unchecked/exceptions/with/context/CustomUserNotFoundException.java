package chapter7.errorhandling.unchecked.exceptions.with.context;

public class CustomUserNotFoundException extends RuntimeException{
    public CustomUserNotFoundException(String id) {
        super("User with ID " + id + " not found.");
    }

}

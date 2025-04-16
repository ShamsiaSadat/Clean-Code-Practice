package chapter_7_ErrorHandling.uncheckedExceptionsWithContext;

public class CustomUserNotFoundException extends RuntimeException{
    public CustomUserNotFoundException(String id) {
        super("User with ID " + id + " not found.");
    }

}

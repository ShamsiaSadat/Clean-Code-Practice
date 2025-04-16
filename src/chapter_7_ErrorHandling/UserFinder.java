package chapter_7_ErrorHandling;
import chapter_7_ErrorHandling.uncheckedExceptionsWithContext.CustomUserNotFoundException;

import java.util.Map;
import java.util.HashMap;
public class UserFinder {

    private static final Map<String, String> USERS = new HashMap<>();
    static {
        USERS.put("1", "Alice");
    }

    public String findUser(String id) {
        if (!USERS.containsKey(id)) {
            throw new chapter_7_ErrorHandling.uncheckedExceptionsWithContext.CustomUserNotFoundException(id);
        }
        return USERS.get(id);
    }

    public void run() {
        try {
            System.out.println("User: " + findUser("999"));
        } catch (CustomUserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

package chapter7.errorhandling;
import chapter7.errorhandling.unchecked.exceptions.with.context.CustomUserNotFoundException;

import java.util.Map;
import java.util.HashMap;
public class UserFinder {

    private static final Map<String, String> USERS = new HashMap<>();
    static {
        USERS.put("1", "Alice");
    }

    public String findUser(String id) {
        if (!USERS.containsKey(id)) {
            throw new CustomUserNotFoundException(id);
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

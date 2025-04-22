package chapter7.errorhandling;

import java.util.Optional;

public class OptionalExample {

    public Optional<String> getUser(String id) {
        if (id.equals("1")) return Optional.of("Alice");
        return Optional.empty();
    }

    public void run() {
        Optional<String> user = getUser("2");
        user.ifPresentOrElse(
                name -> System.out.println("User: " + name),
                () -> System.out.println("User not found")
        );
    }

}

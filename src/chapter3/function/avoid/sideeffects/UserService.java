package chapter3.function.avoid.sideeffects;

public class UserService {
    public static boolean logchecked = false;

    public static boolean isUserActiveWithSideEffect(User user) {
        logchecked = true; //function with side effect
        System.out.println("user name" + user.getName());
        return user.isActive();
    }

    //clean function from side effect
    public boolean isUserActive(User user) {
        return user.isActive();
    }
}

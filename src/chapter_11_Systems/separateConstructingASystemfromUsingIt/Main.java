package chapter_11_Systems.separateConstructingASystemfromUsingIt;

public class Main {
    public static void main(String[] args) {
        Database realDb = new Database();
        UserService userService = new UserService(realDb);

        userService.saveUser("Ali");
    }
}

package chapter_11_Systems.separateConstructingASystemfromUsingIt;

public class Main {
    public static void main(String[] args) {
        Database realDb = new Database();
        GoodUserService userService = new GoodUserService(realDb);

        userService.saveUser("Ali");
    }
}

package chapter11.systems.separate.constructing.asystem.from.using.it;

public class Main {
    public static void main(String[] args) {
        Database realDb = new Database();
        GoodUserService userService = new GoodUserService(realDb);

        userService.saveUser("Ali");
    }
}

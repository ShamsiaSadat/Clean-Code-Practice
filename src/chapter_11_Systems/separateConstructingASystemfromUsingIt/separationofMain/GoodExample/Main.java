package chapter_11_Systems.separateConstructingASystemfromUsingIt.separationofMain.GoodExample;

public class Main {
    public static void main(String[] args) {
        UserService service = AppConfig.createUserService(); // from config
        service.saveUser("Ali");
    }
}

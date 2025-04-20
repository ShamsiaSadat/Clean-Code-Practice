package chapter_11_Systems.separationofMain.GoodExample;

public class Main {
    public static void main(String[] args) {
        UserService1 service = AppConfig.createUserService(); // from config
        service.saveUser("Ali");
    }
}

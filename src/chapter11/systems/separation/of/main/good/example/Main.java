package chapter11.systems.separation.of.main.good.example;

public class Main {
    public static void main(String[] args) {
        UserService1 service = AppConfig.createUserService(); // from config
        service.saveUser("Ali");
    }
}

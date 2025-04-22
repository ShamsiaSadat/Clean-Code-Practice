package chapter11.systems.separation.of.main.good.example;

public class AppConfig {
    public static UserService1 createUserService() {
        Database db = new Database();
        return new UserService1(db);
    }
}

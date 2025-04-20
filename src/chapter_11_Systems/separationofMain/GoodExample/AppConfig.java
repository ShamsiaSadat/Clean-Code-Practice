package chapter_11_Systems.separationofMain.GoodExample;

public class AppConfig {
    public static UserService1 createUserService() {
        Database db = new Database();
        return new UserService1(db);
    }
}

package chapter_11_Systems.separateConstructingASystemfromUsingIt.separationofMain.GoodExample;

public class AppConfig {
    public static UserService createUserService() {
        Database db = new Database();
        return new UserService(db);
    }
}

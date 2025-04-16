package chapter_11_Systems.separateConstructingASystemfromUsingIt.separationofMain.GoodExample;

public class UserService {
    private final Database db;

    public UserService(Database db) {
        this.db = db;
    }

    public void saveUser(String name) {
        db.save(name);
    }
}

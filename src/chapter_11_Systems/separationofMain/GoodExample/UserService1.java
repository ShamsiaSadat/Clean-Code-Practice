package chapter_11_Systems.separationofMain.GoodExample;

public class UserService1 {
    private final Database db;

    public UserService1(Database db) {
        this.db = db;
    }

    public void saveUser(String name) {
        db.save(name);
    }
}

package chapter11.systems.separation.of.main.good.example;

public class UserService1 {
    private final Database db;

    public UserService1(Database db) {
        this.db = db;
    }

    public void saveUser(String name) {
        db.save(name);
    }
}

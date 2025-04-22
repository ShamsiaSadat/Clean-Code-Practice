package chapter11.systems.separate.constructing.asystem.from.using.it;


public class GoodUserService {
    private final Database db;

    public GoodUserService(Database db) {
        this.db = db;
    }

    public void saveUser(String name) {
        db.save(name);
    }
}

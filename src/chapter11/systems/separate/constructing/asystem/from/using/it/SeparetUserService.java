package chapter11.systems.separate.constructing.asystem.from.using.it;

public class SeparetUserService {
    private final Database db;

    public SeparetUserService() {
        this.db = new Database();
    }

    public void saveUser(String name) {
        db.save(name);
    }
}
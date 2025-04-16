package chapter_11_Systems.separateConstructingASystemfromUsingIt;

import chapter_10_Classes.classesShouldBeSmall.User;

public class GoodUserService {
    private final Database db;

    public GoodUserService(Database db) {
        this.db = db;
    }

    public void saveUser(String name) {
        db.save(name);
    }
}

package chapter_11_Systems.separateConstructingASystemfromUsingIt;

public class SeparetUserService {
    private final Database db;

    public SeparetUserService() {
        this.db = new Database();
    }

    public void saveUser(String name) {
        db.save(name);
    }
}
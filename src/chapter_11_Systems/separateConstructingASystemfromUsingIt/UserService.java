package chapter_11_Systems.separateConstructingASystemfromUsingIt;

public class UserService {
    //Bad Example
    private Database db = new Database();

    public UserService(Database realDb) {
    }

    public void saveUser(String user) {
        db.save(user);
    }

}

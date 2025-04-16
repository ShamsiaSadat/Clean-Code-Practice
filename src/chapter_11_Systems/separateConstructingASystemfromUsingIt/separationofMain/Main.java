package chapter_11_Systems.separateConstructingASystemfromUsingIt.separationofMain;

import chapter_11_Systems.separateConstructingASystemfromUsingIt.Database;
import chapter_11_Systems.separateConstructingASystemfromUsingIt.UserService;

//everything mixed together
public class Main {

    public static void main() {
        Database db = new Database();
        UserService service = new UserService(db);

        service.saveUser("Ali");
    }
}

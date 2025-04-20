package chapter_8_Boundaries.usingThirdPartyCode;
import com.google.gson.Gson;

public class BadUserService {

    public void saveUser(String jsonData) {
        Gson gson = new Gson();
        User user = gson.fromJson(jsonData, User.class);  // tightly coupled
        System.out.println("Saving user: " + user.getName());
    }

}

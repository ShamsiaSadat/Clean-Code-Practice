package chapter_8_Boundaries.usingThirdPartyCode.GoodPractice;

public class UserService {
    private final JsonParser parser;

    public UserService(JsonParser parser) {
        this.parser = parser;
    }

    public void saveUser(String jsonData) {
        User user = parser.fromJson(jsonData, User.class);  // uses our interface
        System.out.println("Saving user: " + user.getName());
    }

    public static void main(String[] args) {
        JsonParser parser = new GsonJsonParser();
        UserService service = new UserService(parser);
        service.saveUser("{\"name\": \"Alice\"}");
    }
}

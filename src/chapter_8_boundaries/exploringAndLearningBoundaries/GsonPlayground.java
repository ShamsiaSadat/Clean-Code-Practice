package chapter_8_boundaries.exploringAndLearningBoundaries;

import com.google.gson.Gson;

public class GsonPlayground {
    public static void main(String[] args) {
        User user = new User("Alice", 30);
        Gson gson = new Gson();
        String json = gson.toJson(user);

        String inputJson = "{\"name\":\"Sadat\",\"age\":22}";
        User parsedUser = gson.fromJson(inputJson, User.class);
        System.out.println("Parsed user name: " + parsedUser.getName());
        System.out.println("Parsed User age: " + parsedUser.getAge());

    }
}
